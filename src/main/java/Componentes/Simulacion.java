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
    private String cadenaTablaEventos;
    
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
    
    private TablaDatosClientes tablaDatosClientes;
      
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
        this.estadisticas = new Estadisticas(cantServidores, unidadTiempo);
        this.tablaDatosClientes = new TablaDatosClientes();
        
        //Inicializamos las salidas
        for(int i = 0; i < cantServidores; i++){
            salidas.add(i, new Salida());    
        } 
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
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
        int siguienteServidorLibre;
        
        /*/* -->>>>>>>>>>>>>>>> AÑADIR DATOS DE LA TABLA */
        tablaDatosClientes.añadirCliente(1, 0, 3);
        tablaDatosClientes.añadirCliente(2, 2, 3);
        tablaDatosClientes.añadirCliente(3, 2, 2);
        tablaDatosClientes.añadirCliente(4, 3, 1);
        tablaDatosClientes.añadirCliente(5, 4, 1);
        tablaDatosClientes.añadirCliente(6, 2, 2);
        tablaDatosClientes.añadirCliente(7, 1, 1);
        tablaDatosClientes.añadirCliente(8, 3, 2);
        tablaDatosClientes.añadirCliente(9, 3, 0);
        tablaDatosClientes.añadirCliente(10, 6, 3);
        tablaDatosClientes.añadirCliente(11, 3, 7);
        tablaDatosClientes.añadirCliente(12, 3, 7); 
        
        cadenaTablaEventos = "\n\nTABLA DE EVENTOS: \n\n/////////////////////////////////////////////////////////////////\n";
        
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
                    
                    //Se obtiene el numero del proximo servidor libre
                   siguienteServidorLibre = estatusServidores.siguienteServidorLibre();
                 
                    //Se asigna ese servidor libre al cliente que esta llegado para que este sea atentido
                    estatusServidores.añadirCliente(siguienteServidorLibre, numCliente);
                   
                    llegadas.add(new Llegada(numCliente, tiempoSimulacion));
                   
                    //Se genera una salida en el servidor libre que fue asignado al cliente en el paso anterior
                    salidas.get(siguienteServidorLibre).generarSiguienteSalida(numCliente, tiempoSimulacion + tablaDatosClientes.buscarCliente(numCliente).getTS());  
      
                   cantClientesEnSistema++;
                   estadisticas.actualizarCantClientesNoEsperan();
                }else{
                   
                   //El cliente llega y todos los servidores estan ocupados, hace cola
                   if(lineaEspera.añadirCliente(numCliente) == 0){
                       
                       //La linea de espera alcanzo su capacidad maxima, el cliente se va
                       estadisticas.actualizarCantClientesSeVanSinAtender();
                    }else{
                       llegadas.add(new Llegada(numCliente, tiempoSimulacion));
                       cantClientesEnSistema++;
                       estadisticas.actualizarCantClientesEsperan();
                    }
                }
               
               tiempoSiguienteLlegada = tiempoSimulacion + tablaDatosClientes.buscarCliente(numCliente + 1).getTELL();
               
            }else{
                tipoEvento = "Salida";

                tiempoPrevioSimulacion = tiempoSimulacion;
                tiempoSimulacion = tiempoSiguienteSalida;
                
                estadisticas.actualizarCantClientesEnCola(tiempoPrevioSimulacion, tiempoSimulacion, lineaEspera.longitudColaEspera());
                estadisticas.actualizarCantClientesEnSistema(tiempoPrevioSimulacion, tiempoSimulacion, cantClientesEnSistema);
                cantClientesEnSistema--;
                
                //Finalizamos el servicio del cliente que se va
                
                //Obtenemos el numero del cliente que se va
                numClienteSalida = siguienteSalida.getNumCliente();
                estadisticas.actualizarTiempoClienteEnSistema(llegadas.get(obtenerLlegada(numClienteSalida)).getTiempoLlegada(), tiempoSimulacion);
                
                //Sacamos al cliente que va a salir del sistema del servidor en donde estaba siendo atentido
                siguienteServidorLibre = estatusServidores.sacarCliente(numClienteSalida);
                llegadas.remove(obtenerLlegada(numClienteSalida));
                estadisticas.actualizarPorcentajesUtilizacionServidores(tiempoPrevioSimulacion, tiempoSimulacion, estatusServidores);
                
                if(lineaEspera.longitudColaEspera() > 0){
                  
                    //Buscamos al primer cliente de la cola para que este sea atentido
                    primerClienteCola = lineaEspera.sacarCliente();

                    //Le asignamos un servidor a ese cliente
                    estatusServidores.añadirCliente(siguienteServidorLibre, primerClienteCola);

                    //Generamos una salida para el nuevo servicio que se genero (EN EL PROXIMO SERVIDOR LIBRE)
                    siguienteSalida.generarSiguienteSalida(primerClienteCola, tiempoSimulacion + tablaDatosClientes.buscarCliente(primerClienteCola).getTS());             
                
                    estadisticas.actualizarTiempoClienteEnCola(tiempoSimulacion, llegadas.get(obtenerLlegada(primerClienteCola)).getTiempoLlegada());
                    
                }else{
                  
                    //No hay cola, el sistema queda vacio
                    siguienteSalida.generarSiguienteSalida(0, Constantes.NUMERO_GRANDE);
                }    
            }
          
            cadenaTablaEventos += "\n* Tabla del evento:\n----------------------------------------------------------------\n"
                                + numEvento  + ") Tipo de evento:" + tipoEvento 
                                + "  NºCliente:" + ( tipoEvento == "Llegada" ? numCliente : numClienteSalida)
                                + "  TM:" + tiempoSimulacion 
                                + estatusServidores.toString() 
                                + "  WL:" + lineaEspera.longitudColaEspera() 
                                + "  AT:" + tiempoSiguienteLlegada  + imprimirSalidas() 
                                + "\n----------------------------------------------------------------\n"
                                + "\n" + lineaEspera.toString() + "\n" 
                                + estatusServidores.imprimirDetallesEstatusServidores()
                                + "\n/////////////////////////////////////////////////////////////////\n"; 
        
            
        /* -->>>>>>>>>>>>>>>>COLOCAR LA CANTIDAD DE EVENTOS */
        }while(numEvento < 16);
        
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
    
     /**
     * Retorna la cadena que contiene las proximas salidas de todos los servidores
     * del sistema
     * 
     * @return Cadena con las proximas salidas del sistema
     */
    public String imprimirSalidas(){
        String textoSiguientesSalidas = "";
        
            for(int i = 0; i < salidas.size(); i++){
                textoSiguientesSalidas += "  DT" + (i + 1) + ":" + salidas.get(i).getTiempoSalida();
            }
            
        return textoSiguientesSalidas;
    }
    
    /**
     * Retorna la cadena que contiene los parametros de entrada de la simulacion del sistema
     * 
     * @return Cadena con los parametros de entrada de la simulacion
     */
    public String imprimirParametrosEntradaSimulacion(){
        String unidadTiempoXDolar = unidadTiempo + "/$";
        
        return "PARAMETROS DE ENTRADA DE LA SIMULACION\n" 
                                + "\n* Unidad de tiempo: " + unidadTiempo
                                + "\n* Duracion de la simulacion: " + duracionSimulacion + " " + unidadTiempo
                                + "\n* Cantidad de clientes permitidos: " + cantClientesPermitidos + " clientes"
                                + "\n* Costo de espera del cliente: " + costoEsperaCliente + " " + unidadTiempoXDolar
                                + "\n* Cantidad de servidores: " + cantServidores + " servidores"
                                + "\n* Costo de cada servidor: " + costoServidor + " " + unidadTiempoXDolar 
                                + "\n" + tablaTELL.toString() 
                                + "\n" + tablaTiempoServicio.toString() + "\n\n\n\n";
    }
    
    /**
     * Retorna la cadena que contiene las estadisticas de la simulacion del sistema
     * 
     * @return Cadena con las estadisticas de la simulacion del sistema
     */
    public String imprimirEstadisticasSimulacion(){
        return estadisticas.toString();
    }
    
    /**
     * Retorna la cadena que contiene la tabla de eventos de la simulacion del sistema
     * 
     * @return Cadena con la tabla de eventos de la simulacion del sistema
     */
    public String getCadenaTablaEventos(){
        return cadenaTablaEventos;
    }
    
    public ArrayList<Salida> getSalidas() {
        return salidas;
    }
}

