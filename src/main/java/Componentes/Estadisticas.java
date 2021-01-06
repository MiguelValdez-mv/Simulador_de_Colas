
package Componentes;

/**
 * Esta clase es usada para gestionar las estadisticas finales de la simulacion
 * 
 * @version Nº1 03/12/2020
 * @author Miguel Valdez
 */
public class Estadisticas {
    
    private int tiempoFinal;
    private int cantClientesNoEsperan;
    private int cantClientesSeVanSinAtender;
    private int cantClientesEsperan;
    private int cantLlegadas;
    private double probabilidadEspera;
    private double cantClientesEnCola;
    private double cantClientesEnSistema;
    private double tiempoEnCola;
    
    
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
    
    //Calcular
    
    public void calcularProbabilidadEspera(){
        probabilidadEspera = cantClientesEsperan / cantLlegadas;
    }
    
    public void calcularCantidadPromedioClientesEnCola(){
        cantClientesEnCola = cantClientesEnCola / tiempoFinal;
    }
    
    public void calcularCantidadPromedioClientesEnSistema(){
        cantClientesEnSistema = cantClientesEnSistema / tiempoFinal;
    }
    
}
