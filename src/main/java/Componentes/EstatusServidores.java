
package Componentes;

import java.util.*;

/**
 * Esta clase es usada para gestionar el estatus de los servidores en el sistema
 * 
 * @version Nº1 03/12/2020
 * @author Miguel Valdez
 */
public class EstatusServidores {
    private final int cantServidores;
    private ArrayList<Integer> estatusServidores;
    
    public EstatusServidores(int cantServidores) {
        this.cantServidores = cantServidores;
        this.estatusServidores = new ArrayList<>();
        for(int i = 0; i < cantServidores; i++){
            estatusServidores.add(i, 0);    
        }
    }
    
    /**
     * Añade un cliente en un servidor especifico
     * 
     * @param index Numero del servidor
     * @param numCliente Numero del cliente
     */
    public void añadirCliente(int index, int numCliente){
        estatusServidores.set(index, numCliente);
    }
    
    /**
     * Saca a un cliente de un servidor en especifico
     * 
     * @param numCliente Numero del cliente
     * @return Numero de servidor en donde ESTABA el cliente
     */
    public int sacarCliente(int numCliente){
       for(int i=0; i < estatusServidores.size(); i++){
            if(estatusServidores.get(i) == numCliente){
               estatusServidores.set(i, 0);
               
               return i;
            }
        }
       
       return -1; //No saco a ningun cliente (no existe)
    }
    
    /**
     * Consulta si un servidor esta ocupado
     * 
     * @param index Numero del servidor 
     * @return Numero de cliente (en caso de estar ocupado), 0 si esta descocupado
     */
    public int estaOcupado(int index){
        return estatusServidores.get(index);
    }
     
    /**
     * Determina el numero del proximo servidor libre
     * 
     * @return Numero del proximo servidor libre
     */
    public int siguienteServidorLibre(){
        for(int i = 0; i < estatusServidores.size(); i++){
            if(estaOcupado(i) == 0)
                return i;
        }
        
        return -1; //Todos los servidores estan ocupados
    }
    
    @Override
    public String toString() {
        String salida="Lista de servidores: \n";
        String cadenaDesocupado = " actualmente desocupado";
        for(int i = 0; i< estatusServidores.size(); i++){
            salida += "Servidor Nº: " + (i + 1) +  (estaOcupado(i) > 0 ? 
                    " ocupado por el cliente Nº: " + estatusServidores.get(i) : cadenaDesocupado)
                    + "\n";
        }

        return salida;
    }
}
