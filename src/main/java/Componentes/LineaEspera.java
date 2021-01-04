
package Componentes;

import java.util.*;

/**
 * Esta clase gestiona la linea de espera del sistema
 * 
 * @version Nº1 28/12/2020
 * @author Miguel Valdez
 */
public class LineaEspera {
    private int capacidad;
    private ArrayList<Integer> colaEspera;
    
    public LineaEspera(int cantClientesPermitidos, int cantServidores) {
        this.capacidad = cantClientesPermitidos - cantServidores;
        this.colaEspera = new ArrayList<>();
    }
    
    /**
     * Añade un cliente a la cola de espera
     * 
     * @param numCliente Numero del cliente 
     * @return 1 si se pudo añadir el cliente a la cola, 0 en caso contario
     */
    public int añadirCliente(int numCliente){
        if(colaEspera.size() < capacidad){
            colaEspera.add(numCliente);
            
            return 1;
        }
        
        return 0;
    }
        
    /**
     * Saca de la cola de espera al siguiente cliente por ser atendido
     * 
     * @return Numero del cliente que se saco de la cola, -1 si no se saco a nadie
     */
    public int sacarCliente(){
        if(colaEspera.size() > 0){
            int cliente = colaEspera.get(0);
            colaEspera.remove(0);
            
            return cliente;
        }
        
        return -1;
    }
    
    /**
     * Determina si la cola esta vacia 
     * 
     * @return True si esta vacia, False si no
     */
    public boolean colaVacia(){
        return colaEspera.isEmpty();
    }
    
    /**
     * Obtiene el tamaño de la cola de espera
     * 
     * @return Tamaño de la cola de espera
     */
    public int longitudColaEspera(){
        return colaEspera.size();
    }
    
    @Override
    public String toString() {
        String salida="Linea de espera: \n";
        
        for(int i = 0; i < colaEspera.size(); i++){
            salida += "Posicion: " + i + " ocupada por el cliente Nº: " + colaEspera.get(i);
        }

        return salida;
    }
}
