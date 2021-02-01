
package Componentes;

/**
 * Esta clase es usada para gestionar los datos de un cliente
 * 
 * @version Nº1 03/12/2020
 * @author Miguel Valdez
 */
public class Cliente {
    
    private int numCliente;
    private int tiempoLlegada;
    private int tiempoServicio;
    
    public Cliente(int numCliente, int tiempoLlegada) {
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

    /**
     * Regresa el tiempo de servicio del cliente
     * 
     * @return Tiempo de servicio (actual)
     */
    public int getTiempoServicio() {
        return tiempoServicio;
    }

    /** 
     * Establece el tiempo de servicio del cliente
     * 
     * @param tiempoServicio tiempo de servicio del cliente (nuevo)
     */
    public void setTiempoServicio(int tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }
}
