
package Componentes;
/**
 * En esta clase se guardara el tiempo de llegada de un cliente al sistema
 * 
 * @version Nº1 02/12/2020
 * @author Miguel Valdez
 */
public class EntradaCliente {
    
    private int numCliente;
    private int tiempoLlegada;
  
    /**
     * @param numCliente Numero que representa a un cliente
     * @param tiempoLlegada Valor de tiempo de llegada de un cliente
     */
    public EntradaCliente(int numCliente, int tiempoLlegada) {
        this.numCliente = numCliente;
        this.tiempoLlegada = tiempoLlegada;
    }
    
    /**
     * Devuelve numero de cliente
     * @return Numero de cliente
     */
    public int getNumCliente() {
        return numCliente;
    }
    
    /**
     * Establece el numero de un cliente
     * @param numCliente Numero del cliente (nuevo)
     */
    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    /**
     * Devuelve el tiempo de llegada del cliente al sistema
     * @return Tiempo de llegada del cliente
     */
    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    /**
     * Establece el valor de llegada de un cliente al sistema
     * @param tiempoLlegada Tiempo de llegada (nuevo) 
     */
    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }
    
    @Override
    public String toString() {
        return "AT: " + tiempoLlegada + ", NroC: " + numCliente;
    }  
}
