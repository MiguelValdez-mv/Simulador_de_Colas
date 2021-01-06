package Componentes;

import Utils.*;
import java.util.*;
import Constantes.Constantes;

/**
 * Esta clase manejara todo lo relacionado a la simulacion del sistema 
 * 
 * @version Nº1 02/12/2020
 * @author Miguel Valdez
 */
public class Simulacion {
    
    private Aleatorio aleatorio;
    
    // Parametros de entrada
    private String unidadTiempo;
    private int duracionSimulacion;
    private int cantClientesPermitidos;
    private int costoEsperaCliente;
    private int cantServidores;
    private int costoServidor;  
    private TablaDistribucion tablaTELL;
    private TablaDistribucion tablaTiempoServicio;
    
    // Condiciones iniciales 
    private int numEvento;
    private String tipoEvento;
    private int numCliente;
    private int tiempoSimulacion;
    private int tiempoPrevioSimulacion;
    private EstatusServidores estatusServidores;
    private LineaEspera lineaEspera;
    private int tiempoSiguienteLlegada;
    private ArrayList<Llegada> llegadas;
    private ArrayList<Salida> salidas;
    private int cantClientesEnSistema;
    
    //estadisticas
    Estadisticas estadisticas;
      
    public Simulacion(String unidadTiempo, int duracionSimulacion, int cantClientesPermitidos, int costoEsperaCliente, int cantServidores, int costoServidor, TablaDistribucion tablaTELL, TablaDistribucion tablaTiempoServicio) {
        this.aleatorio = new Aleatorio();
        this.unidadTiempo = unidadTiempo;
        this.duracionSimulacion = duracionSimulacion;
        this.cantClientesPermitidos = cantClientesPermitidos;
        this.costoEsperaCliente = costoEsperaCliente;
        this.cantServidores = cantServidores;
        this.costoServidor = costoServidor;
        this.tablaTELL = tablaTELL;
        this.tablaTiempoServicio = tablaTiempoServicio;
        this.numEvento = 0;
        this.tipoEvento = "Condiciones iniciales";
        this.numCliente = 0;
        this.tiempoSimulacion = 0;
        this.tiempoPrevioSimulacion = 0;
        this.estatusServidores = new EstatusServidores(cantServidores);
        this.lineaEspera = new LineaEspera(cantClientesPermitidos, cantServidores);
        this.tiempoSiguienteLlegada = 0;
        this.llegadas = new ArrayList<>();
        this.salidas = new ArrayList<>();
        this.cantClientesEnSistema = 0;
        this.estadisticas = new Estadisticas(cantServidores);
        
        //Inicializamos las salidas
        for(int i = 0; i < cantServidores; i++){
            salidas.add(i, new Salida());    
        } 
    }
    
    /*
        numEvento
        tipoEvento
        numCliente
        tiempoSimulacion        | TM
        estatusServidores       | SS
        lineaEspera             | WL
        tiempoSiguienteLlegada  | AT
        tiempoSiguienteSalida   | DT     
    */    
    public void iniciar(){    
        Salida siguienteSalida;
        int tiempoSiguienteSalida;
        int primerClienteCola;
        int numClienteSalida = 0;
        
        do{
          numEvento++;
          siguienteSalida = obtenerSiguienteSalida();
          tiempoSiguienteSalida = siguienteSalida.getTiempoSalida();
         
          if(tiempoSiguienteLlegada < tiempoSiguienteSalida){
                tipoEvento = "Llegada";
                numCliente++;
                   
                tiempoPrevioSimulacion = tiempoSimulacion;
                tiempoSimulacion = tiempoSiguienteLlegada;
                
                estadisticas.actualizarCantLlegadas();
                estadisticas.actualizarCantClientesEnCola(tiempoPrevioSimulacion, tiempoSimulacion, lineaEspera.longitudColaEspera());
                estadisticas.actualizarCantClientesEnSistema(tiempoPrevioSimulacion, tiempoSimulacion, cantClientesEnSistema);
                estadisticas.actualizarPorcentajesUtilizacionServidores(tiempoPrevioSimulacion, tiempoSimulacion, estatusServidores);
                
                if(estatusServidores.hayServidorLibre()){
                   
                    //El cliente llega al sistema y no hace cola
                    int siguienteServidorLibre = estatusServidores.siguienteServidorLibre();
                 
                    estatusServidores.añadirCliente(siguienteServidorLibre, numCliente);
                   
                    llegadas.add(new Llegada(numCliente, tiempoSimulacion));
                   
                    salidas.get(siguienteServidorLibre).generarSiguienteSalida(numCliente, tiempoSimulacion + generarTiempoServicio());  
      
                   cantClientesEnSistema++;
                   estadisticas.actualizarCantClientesNoEsperan();
                }else{
                   
                   //El cliente llega y todos los servidores estan desocupados, hace cola
                   if(lineaEspera.añadirCliente(numCliente) == 0){
                       
                       //La linea de espera alcanzo su capacidad maxima, el cliente se va
                       estadisticas.actualizarCantClientesSeVanSinAtender();
                    }else{
                       llegadas.add(new Llegada(numCliente, tiempoSimulacion));
                       cantClientesEnSistema++;
                       estadisticas.actualizarCantClientesEsperan();
                    }
                }
               
               tiempoSiguienteLlegada = tiempoSimulacion + generarTELL();
               
            }else{
                tipoEvento = "Salida";

                tiempoPrevioSimulacion = tiempoSimulacion;
                tiempoSimulacion = tiempoSiguienteSalida;
                
                estadisticas.actualizarCantClientesEnCola(tiempoPrevioSimulacion, tiempoSimulacion, lineaEspera.longitudColaEspera());
                estadisticas.actualizarCantClientesEnSistema(tiempoPrevioSimulacion, tiempoSimulacion, cantClientesEnSistema);
                cantClientesEnSistema--;
                
                //Finalizamos el servicio del cliente que se va
                numClienteSalida = siguienteSalida.getNumCliente();
                estadisticas.actualizarTiempoClienteEnSistema(llegadas.get(obtenerLlegada(numClienteSalida)).getTiempoLlegada(), tiempoSimulacion);
                estatusServidores.sacarCliente(numClienteSalida);
                llegadas.remove(obtenerLlegada(numClienteSalida));
                estadisticas.actualizarPorcentajesUtilizacionServidores(tiempoPrevioSimulacion, tiempoSimulacion, estatusServidores);
                
                if(lineaEspera.longitudColaEspera() > 0){
                  
                    //Buscamos al primer cliente de la cola para que este sea atentido
                    primerClienteCola = lineaEspera.sacarCliente();

                    //Le asignamos un servidor a ese cliente
                    estatusServidores.añadirCliente(estatusServidores.siguienteServidorLibre(), primerClienteCola);

                    //Generamos una salida para el nuevo servicio que se genero
                    siguienteSalida.generarSiguienteSalida(primerClienteCola, tiempoSimulacion + generarTiempoServicio());             
                
                    estadisticas.actualizarTiempoClienteEnCola(tiempoSimulacion, llegadas.get(obtenerLlegada(primerClienteCola)).getTiempoLlegada());
                    
                }else{
                  
                    //No hay cola, el sistema queda vacio
                    siguienteSalida.generarSiguienteSalida(0, Constantes.NUMERO_GRANDE);
                }    
            }
          
            System.out.println("*****************************************************************");
            System.out.println("\nTabla de Eventos:");
            System.out.println("----------------------------------------------------------------");   
            System.out.println(numEvento  + ") Tipo de evento:" + tipoEvento 
                              + "  NºCliente:" + ( tipoEvento == "Llegada" ? numCliente : numClienteSalida)
                              + "  TM:" + tiempoSimulacion 
                              + estatusServidores.toString() 
                              + "  WL:" + lineaEspera.longitudColaEspera() 
                              + "  AT:" + tiempoSiguienteLlegada  + imprimirSalidas());
            System.out.println("----------------------------------------------------------------\n");
            System.out.println(lineaEspera.toString() + "\n");
            System.out.println(estatusServidores.imprimirDetallesEstatusServidores());
            System.out.println("*****************************************************************\n");
        
        }while(tiempoSimulacion <= duracionSimulacion);
        
        estadisticas.obtenerEstadisticas(tiempoSimulacion, duracionSimulacion, costoServidor, costoEsperaCliente);
    
    }
    
    /**
     * Genera un tiempo de servicio mediante un numero aleatorio
     * 
     * @return Tiempo de servicio aleatorio
     */
    public int generarTiempoServicio(){
        return tablaTiempoServicio.obtenerValor(aleatorio.generarAleatorio());
    }
        
    /**
     * Genera un tiempo entre llegadas mediante un numero aleatorio
     * 
     * @return Tiempo entre llegadas aleatorio
     */
    public int generarTELL(){
        return tablaTELL.obtenerValor(aleatorio.generarAleatorio());
    }
            
    /**
     * Regresa la "columna" de la siguiente salida
     * 
     * @return Siguiente salida
     */
    public Salida obtenerSiguienteSalida(){
        return Collections.min(salidas, Comparator.comparing(s -> s.getTiempoSalida()));
    }
    
    
    /**
     * Busca una llegada de la "lista de llegadas" a partir del numero del cliente
     * 
     * @param numCliente Index del numero del cliente
     */
    public int obtenerLlegada(int numCliente){
        for(int i = 0; i < llegadas.size(); i++){
            if(llegadas.get(i).getNumCliente() == numCliente){
                return i;
            }
        }
        
        return -1;
    }
    
    public String imprimirSalidas(){
        String textoSiguientesSalidas = "";
        
            for(int i = 0; i < salidas.size(); i++){
                textoSiguientesSalidas += "  DT" + (i + 1) + ":" + salidas.get(i).getTiempoSalida();
            }
            
        return textoSiguientesSalidas;
    }
}

