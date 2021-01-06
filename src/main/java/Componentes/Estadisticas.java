
package Componentes;

import java.util.ArrayList;

/**
 * Esta clase es usada para gestionar las estadisticas finales de la simulacion
 * 
 * @version Nº1 03/12/2020
 * @author Miguel Valdez
 */
public class Estadisticas {
    
    private int cantClientesNoEsperan;
    private int cantClientesSeVanSinAtender;
    private int cantClientesEsperan;
    private int cantLlegadas;
    private double probabilidadEspera;
    private double cantClientesEnCola;
    private double cantClientesEnSistema;
    private double tiempoEnCola;
    private double tiempoEnSistema;
    private double tiempoAdicional;
    private ArrayList<Double> porcentajeUtilizacion;
    private double porcentajeUtilizacionGeneral;
    private double relacionOptima;
    
    public Estadisticas(int numeroServidores){
        this.porcentajeUtilizacion = new ArrayList<>();
        
        for(int i = 0; i < numeroServidores; i++){
            porcentajeUtilizacion.add(0.0);
        }
    }
       
    public void actualizarCantClientesNoEsperan(){
        cantClientesNoEsperan++;
    }
    
    public void actualizarCantClientesSeVanSinAtender(){
        cantClientesSeVanSinAtender++;
    }
    
    public void actualizarCantClientesEsperan(){
        cantClientesEsperan++;
    }
    
    public void actualizarCantLlegadas(){
        cantLlegadas++;
    }
    
    /**
     * Actualiza la cantidad promedio de clientes en cola durante la simulacion
     * 
     * @param tiempoPrevio Indica el tiempo previo de la simulacion
     * @param tiempoActual Indica el tiempo actual de la simulacion
     * @param longitudCola Indica la longitud de la cola
     */
    public void actualizarCantClientesEnCola(int tiempoPrevio, int tiempoActual, int longitudCola){
        if(tiempoActual == 0)
            cantClientesEnCola = 0;
        else{
            cantClientesEnCola += (tiempoActual - tiempoPrevio) * longitudCola;
        }
    }
    
    /**
     * Actualiza la cantidad promedio de clientes en el sistema durante la simulacion
     * 
     * @param tiempoPrevio Indica el tiempo previo de la simulacion
     * @param tiempoActual Indica el tiempo actual de la simulacion
     * @param numClientesEnSistemaActual Indica la cantidad de clientes en el sistema
     */
    public void actualizarCantClientesEnSistema(int tiempoPrevio, int tiempoActual, int numClientesEnSistemaActual){
        if(tiempoActual == 0)
            cantClientesEnSistema = 0;
        else{
            cantClientesEnSistema += (tiempoActual - tiempoPrevio) * numClientesEnSistemaActual;
        }
    }
    
    /**
     * Actualiza el tiempo promedio que un cliente esta en cola
     * 
     * @param tiempoInicioServicio Tiempo de inicio de servicio del cliente
     * @param tiempoLlegada Tiempo de llegada del cliente al sistema
     */
    public void actualizarTiempoClienteEnCola(int tiempoInicioServicio, int tiempoLlegada){
        tiempoEnCola += tiempoInicioServicio - tiempoLlegada;
    }
    
    /**
     * Actualiza el tiempo promedio que un cliente esta en el sistema
     * 
     * @param tiempoEntrada Indica el tiempo de llegada del cliente
     * @param tiempoSalida Indica el tiempo de salida del cliente
     */
    public void actualizarTiempoClienteEnSistema(int tiempoEntrada, int tiempoSalida){
        tiempoEnSistema += tiempoSalida - tiempoEntrada;
    }
    
     /**
     * Actualiza el porcentaje de utilizacion de un servidor en especifico
     * 
     * @param tiempoPrevio Indica el tiempo previo de la simulacion
     * @param tiempoActual Indica el tiempo actual de la simulacion
     * @param numServidor Indica el numero del servidor
     * @param uso Indica si durante el periodo especificado el servido estuvo en uso
     */
    public void actualizarPorcentajeUtilizacion(int tiempoPrevio,int tiempoActual, int numServidor, int uso){
        if(tiempoPrevio == 0 && tiempoActual == 0){
            porcentajeUtilizacion.set(numServidor, 0.0);
        }else{
            porcentajeUtilizacion.set(numServidor, (porcentajeUtilizacion.get(numServidor) + (tiempoActual - tiempoPrevio) * uso));
        }
    }
    
    /**
     * Actualiza los porcentajes de utilizacion de los servidores del sistema
     * @param tiempoPrevio Indica el tiempo previo de la simulacion
     * @param tiempoActual Indica el tiempo actual de la simulacion
     * @param servidores Servidores del sistema
     */
    public void actualizarPorcentajesUtilizacionServidores(int tiempoPrevio, int tiempoActual, EstatusServidores servidores){
        for(int i = 0; i < servidores.getCantServidores(); i++){
            actualizarPorcentajeUtilizacion(tiempoPrevio, tiempoActual, i, servidores.estaOcupado(i) == 0 ? 0 : 1);
        }
    }
    
    public void calcularProbabilidadEspera(){
        probabilidadEspera = cantClientesEsperan / cantLlegadas;
    }
    
    public void calcularCantPromedioClientesEnCola(int tiempoFinalSimulacion){
        cantClientesEnCola = cantClientesEnCola / tiempoFinalSimulacion;
    }
    
    public void calcularCantPromedioClientesEnSistema(int tiempoFinalSimulacion){
        cantClientesEnSistema = cantClientesEnSistema / tiempoFinalSimulacion;
    }
    
    public void calcularTiempoPromedioClienteEnCola(){
        tiempoEnCola = tiempoEnCola / cantLlegadas;
    }
    
    public void calcularTiempoPromedioClienteEnSistema(){
        tiempoEnSistema = tiempoEnSistema / cantLlegadas;
    }
    
    /**
     * Calcula el tiempo adicional que duro la simulacion en comparacion al 
     * tiempo que se tenia previsto terminar
     * 
     * @param tiempoFinalSimulacion Tiempo en el que se detuvo la simulacion
     * @param duracionSimulacion Tiempo previsto de terminacion de la simulacion
     */
    public void calcularTiempoAdicional(int tiempoFinalSimulacion, int duracionSimulacion){
        tiempoAdicional = tiempoFinalSimulacion - duracionSimulacion;
    }
    
    public void calcularPorcentajeUtilizacion(int tiempoFinalSimulacion){
        for(int i=0; i < porcentajeUtilizacion.size(); i++){
            porcentajeUtilizacion.set(i, porcentajeUtilizacion.get(i) / tiempoFinalSimulacion);
        }
    }
    
    public void calcularPorcentajeUtilizacionGeneral(){
        double acum = 0;
        
        for(int i = 0; i < porcentajeUtilizacion.size(); i++){
            acum += porcentajeUtilizacion.get(i);
        }
           
        porcentajeUtilizacionGeneral = acum / porcentajeUtilizacion.size();
    }
    
    
    public void calcularRelacionOptima(int costoEsperaCliente, int costoServidor){
        relacionOptima = (cantClientesEnCola * costoEsperaCliente) / costoServidor;
    }
    
    
    /**
     * Realiza los calculos finales de la simulacion
     * 
     * @param tiempoFinalSimulacion Tiempo en el que se detuvo la simulacion
     * @param duracionSimulacion Tiempo previsto de terminacion de la simulacion
     * @param costoServidor Costo de cada servidor del sistema
     * @param costoEsperaCliente Costo por espera del cliente
     */
    public void obtenerEstadisticas(int tiempoFinalSimulacion, int duracionSimulacion, int costoServidor, int costoEsperaCliente){
        calcularProbabilidadEspera();
        
        calcularCantPromedioClientesEnCola(tiempoFinalSimulacion);
        calcularCantPromedioClientesEnSistema(tiempoFinalSimulacion);
        
        calcularTiempoPromedioClienteEnCola();
        calcularTiempoPromedioClienteEnSistema();
        
        calcularTiempoAdicional(tiempoFinalSimulacion, duracionSimulacion);
        
        calcularPorcentajeUtilizacion(tiempoFinalSimulacion);
        calcularPorcentajeUtilizacionGeneral();
        
        calcularRelacionOptima(costoServidor, costoEsperaCliente);
    }
}
