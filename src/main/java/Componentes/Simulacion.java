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
    private ClientesEnSistema clientesEnSistema;
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
        this.clientesEnSistema = new ClientesEnSistema();
        this.salidas = new ArrayList<>();
        this.cantClientesEnSistema = 0;
        this.estadisticas = new Estadisticas(cantServidores, unidadTiempo);
        
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
        int tiempoServicio;
        Cliente datosClienteSalida;
        
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
                   
                    //Generamos un tiempo de servicio aleatorio
                    tiempoServicio = generarTiempoServicio();
                    
                    clientesEnSistema.añadirCliente(numCliente, tiempoSimulacion);
                    clientesEnSistema.actualizarTiempoServicio(numCliente, tiempoServicio);
                   
                    //Se genera una salida en el servidor libre que fue asignado al cliente en el paso anterior
                    salidas.get(siguienteServidorLibre).generarSiguienteSalida(numCliente, tiempoSimulacion + tiempoServicio);  
      
                    cantClientesEnSistema++;
                    estadisticas.actualizarCantClientesNoEsperan();
                }else{
                   
                   //El cliente llega y todos los servidores estan desocupados, hace cola
                   if(lineaEspera.añadirCliente(numCliente) == 0){
                       
                       //La linea de espera alcanzo su capacidad maxima, el cliente se va
                       estadisticas.actualizarCantClientesSeVanSinAtender();
                    }else{
                       clientesEnSistema.añadirCliente(numCliente, tiempoSimulacion);
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
                estadisticas.actualizarPorcentajesUtilizacionServidores(tiempoPrevioSimulacion, tiempoSimulacion, estatusServidores);
                cantClientesEnSistema--;
                
                //Obtenemos el numero del cliente que se va
                numClienteSalida = siguienteSalida.getNumCliente();
                
                //Obtenemos los datos del cliente que va a salir del sistema
                datosClienteSalida = clientesEnSistema.obtenerDatosCliente(numClienteSalida);
                
                estadisticas.actualizarTiempoClienteEnSistema(datosClienteSalida.getTiempoLlegada(), tiempoSimulacion);
                estadisticas.actualizarTiempoClienteEnCola(tiempoSimulacion, datosClienteSalida.getTiempoLlegada(), datosClienteSalida.getTiempoServicio());
                
                //Sacamos al cliente que va a salir del sistema del servidor en donde estaba siendo atentido
                siguienteServidorLibre = estatusServidores.sacarCliente(numClienteSalida);
                clientesEnSistema.sacarClienteSistema(numClienteSalida);
                
                if(lineaEspera.longitudColaEspera() > 0){
                  
                    //Buscamos al primer cliente de la cola para que este sea atentido
                    primerClienteCola = lineaEspera.sacarCliente();

                    //Le asignamos un servidor a ese cliente
                    estatusServidores.añadirCliente(siguienteServidorLibre, primerClienteCola);

                    //Generamos un tiempo de servicio aleatorio
                    tiempoServicio = generarTiempoServicio();
                    
                    clientesEnSistema.actualizarTiempoServicio(primerClienteCola, tiempoServicio);
                    
                    //Generamos una salida para el nuevo servicio que se genero (EN EL PROXIMO SERVIDOR LIBRE)
                    siguienteSalida.generarSiguienteSalida(primerClienteCola, tiempoSimulacion + tiempoServicio);             
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

