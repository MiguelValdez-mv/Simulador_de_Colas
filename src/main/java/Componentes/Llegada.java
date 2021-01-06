
package Componentes;

/**
 * Esta clase es usada para gestionar las llegadas de los clientes que
 * son atendidos o que estan haciendo cola 
 * 
 * @version Nº1 03/12/2020
 * @author Miguel Valdez
 */
public class Llegada {
    
    private int numCliente;
    private int tiempoLlegada;

    public Llegada(int numCliente, int tiempoLlegada) {
        this.numCliente = numCliente;
        this.tiempoLlegada = tiempoLlegada;
    }

    /**
     * Regresa el numero de cliente
     * 
     * @return Numero de cliente (actual)
     */
    public int getNumCliente() {
        return numCliente;
    }

     /**
     * Regresa el tiempo de llegada del sistema del cliente
     * 
     * @return Tiempo de salida (actual)
     */
    public int getTiempoLlegada() {
        return tiempoLlegada;
    }    
}
