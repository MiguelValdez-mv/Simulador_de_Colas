
package Componentes;

import Constantes.Constantes;

/**
 * Esta clase permite registrar una salida del sistema de un cliente en especifico
 * 
 * @version Nº1 03/01/2020
 * @author Miguel Valdez
 */
public class Salida {
    
    private int numCliente;
    private int tiempoSalida;

    public Salida() {
        this.numCliente = 0;
        this.tiempoSalida = Constantes.NUMERO_GRANDE;
    }
    
    /** 
     * Genera una nueva salida segun el numero de cliente y el tiempo de salida 
     * del sistema del mismo
     * 
     * @param numCliente Numero de cliente (nuevo)
     * @param tiempoSalida Tiempo de salida del sistema (nuevo)
     */
    public void generarSiguienteSalida(int numCliente, int tiempoSalida){
        this.numCliente = numCliente;
        this.tiempoSalida = tiempoSalida;
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
     * Regresa el tiempo de salida del sistema del cliente que esta
     * siendo servido
     * 
     * @return Tiempo de salida (actual)
     */
    public int getTiempoSalida() {
        return tiempoSalida;
    }
}
