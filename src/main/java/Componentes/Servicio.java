
package Componentes;

/**
 * Esta clase permite registrar que cliente esta siendo atentido, tiempo en que 
 * empezo a ser atentido y su tiempo proyectado de salida del sistema 
 * (finalizacion de servicio)
 * 
 * @version Nº1 28/12/2020
 * @author Miguel Valdez
 */
public class Servicio {
    
    private int numCliente;
    private int tiempoInicioServicio;
    private int tiempoServicioCliente;
    private int tiempoProyectadoSalida;

    public Servicio(int numCliente, int tiempoInicioServicio, int tiempoServicioCliente) {
        this.numCliente = numCliente;
        this.tiempoInicioServicio = tiempoInicioServicio;
        this.tiempoServicioCliente = tiempoServicioCliente;
        this.tiempoProyectadoSalida = tiempoInicioServicio + tiempoServicioCliente;
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
     * Establece el numero de cliente
     * 
     * @param numCliente Numero de cliente (nuevo)
     */
    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    /**
     * Regresa el tiempo de INICIO de servicio del cliente
     * 
     * @return Tiempo de inicio de servicio del cliente (actual)
     */
    public int getTiempoInicioServicio() {
        return tiempoInicioServicio;
    }

    /** 
     * Establece el tiempo de INICIO de servicio del cliente
     * 
     * @param tiempoInicioServicio Tiempo de inicio de servicio del cliente (nuevo)
     */
    public void setTiempoInicioServicio(int tiempoInicioServicio) {
        this.tiempoInicioServicio = tiempoInicioServicio;
    }

    /**
     * Regresa el tiempo de servicio del cliente segun la tabla de distribucion de
     * tiempos de servicio
     * 
     * @return Tiempo de servicio del cliente (actual)
     */
    public int getTiempoServicioCliente() {
        return tiempoServicioCliente;
    }

    /** 
     * Establece el tiempo de servicio del cliente
     * 
     * @param tiempoServicioCliente Tiempo de servicio del cliente (nuevo)
     */
    public void setTiempoServicioCliente(int tiempoServicioCliente) {
        this.tiempoServicioCliente = tiempoServicioCliente;
    }

    /**
     * Regresa el tiempo proyectado de salida del sistema del cliente que esta
     * siendo servido
     * 
     * @return Tiempo proyectado de salida (actual)
     */
    public int getTiempoProyectadoSalida() {
        return tiempoProyectadoSalida;
    }

    /** 
     * Establece el tiempo proyectado de salida del sistema del cliente que esta
     * siendo servido
     * 
     * @param tiempoProyectadoSalida Tiempo proyectado de salida (nuevo)
     */
    public void setTiempoProyectadoSalida(int tiempoProyectadoSalida) {
        this.tiempoProyectadoSalida = tiempoProyectadoSalida;
    }
}
