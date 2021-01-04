package Componentes;

import java.util.*;

/**
 * -
 * 
 * @version Nº1 02/12/2020
 * @author Miguel Valdez
 */
public class Simulacion {
    
    /* Parametros de entrada */
    private String unidadTiempo;
    private int duracionSimulacion;
    private int cantClientesPermitidos;
    private int costoEsperaCliente;
    private int cantServidores;
    private int costoServidor;  
    private TablaDistribucion tablaTELL;
    private TablaDistribucion tablaTiempoServicio;
    
    /* Condiciones iniciales */
    private int numeroEvento;
    private String tipoEvento;
    private int numCliente;
    private int tiempoRelojSimulacion;
    private EstatusServidores estatusServidores;
    private LineaEspera lineaEspera;
    private int tiempoSiguienteLlegada;
    private ArrayList<Integer> tiempoSiguienteSalida;
       
    public Simulacion(String unidadTiempo, int duracionSimulacion, int cantClientesPermitidos, int costoEsperaCliente, int cantServidores, int costoServidor, TablaDistribucion tablaTELL, TablaDistribucion tablaTiempoServicio) {
        this.unidadTiempo = unidadTiempo;
        this.duracionSimulacion = duracionSimulacion;
        this.cantClientesPermitidos = cantClientesPermitidos;
        this.costoEsperaCliente = costoEsperaCliente;
        this.cantServidores = cantServidores;
        this.costoServidor = costoServidor;
        this.tablaTELL = tablaTELL;
        this.tablaTiempoServicio = tablaTiempoServicio;
        this.numeroEvento = 0;
        this.tipoEvento = "Condiciones iniciales";
        this.numCliente = 0;
        this.tiempoRelojSimulacion = 0;
        this.estatusServidores = new EstatusServidores(cantServidores);
        this.lineaEspera = new LineaEspera(cantClientesPermitidos, cantServidores);
        this.tiempoSiguienteLlegada = 0;
        this.tiempoSiguienteSalida = new ArrayList<>();
        
        for(int i = 0; i < cantServidores; i++){
            tiempoSiguienteSalida.add(i, 0);    
        }
    }
}
