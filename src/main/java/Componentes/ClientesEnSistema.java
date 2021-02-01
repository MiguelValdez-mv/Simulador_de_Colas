
package Componentes;

import java.util.ArrayList;

/**
 * Esta clase es usada para gestionar los datos de los clientes que estan en el sistema
 * 
 * @version Nº1 03/12/2020
 * @author Miguel Valdez
 */
public class ClientesEnSistema {
     private ArrayList<Cliente> clientes;

    public ClientesEnSistema() {
        this.clientes = new ArrayList<>();
    }
     
    public void añadirCliente(int numCliente, int tiempoLlegada){
        clientes.add(new Cliente(numCliente, tiempoLlegada));
    }
     
    /**
     * Busca a un cliente a partir del numero del cliente
     * 
     * @param numCliente Numero del cliente
     * @return Index del cliente
     */
    public int obtenerIndexCliente(int numCliente){
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getNumCliente() == numCliente){
                return i;
            }
        }
        
        return -1;
    }
    
    /**
     * Actualiza el tiempo de servicio de un cliente 
     * 
     * @param numCliente Numero del cliente
     * @param tiempoServicio Tiempo de servicio del cliente
     */
    public void actualizarTiempoServicio(int numCliente, int tiempoServicio){ 
        int indexCliente = obtenerIndexCliente(numCliente);
        
        clientes.get(indexCliente).setTiempoServicio(tiempoServicio);
    }
    
    /**
     * Nos permite manipular los datos de un cliente en especifico
     * 
     * @param numCliente Numero del cliente
     * @return Retorna los datos de un cliente (el objeto completo)
     */
    public Cliente obtenerDatosCliente(int numCliente){
        return clientes.get(obtenerIndexCliente(numCliente));
    }
    
    /**
     * Saca a un cliente del sistema
     * 
     * @param numCliente Numero del cliente
     */
    public void sacarClienteSistema(int numCliente){
        clientes.remove(obtenerIndexCliente(numCliente));
    }
}
