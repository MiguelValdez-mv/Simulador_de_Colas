
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
    private ArrayList<Integer> servidores;

    public EstatusServidores(int cantServidores) {
        this.cantServidores = cantServidores;
        this.servidores = new ArrayList<>();
        
        for(int i = 0; i < cantServidores; i++){
            servidores.add(i, 0);    
        }
    }
    
    public ArrayList<Integer> getServidores() {
        return servidores;
    }

    public int getCantServidores() {
        return cantServidores;
    }
    
    /**
     * Añade un cliente en un servidor especifico
     * 
     * @param numServidor Numero del servidor
     * @param numCliente Numero del cliente
     */
    public void añadirCliente(int numServidor, int numCliente){
        servidores.set(numServidor, numCliente);
    }
    
    /**
     * Saca a un cliente de un servidor en especifico
     * 
     * @param numCliente Numero del cliente
     * @return Numero de servidor en donde ESTABA el cliente
     */
    public int sacarCliente(int numCliente){
       for(int i=0; i < servidores.size(); i++){
            if(servidores.get(i) == numCliente){
               servidores.set(i, 0);
               
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
        return servidores.get(index);
    }
    
    
    /**
     * Consulta si hay servidores libres
     * 
     * @return True si hay servidores libres, 0 en caso contrario
     */
    public boolean hayServidorLibre(){
        for(int i = 0; i < servidores.size(); i++){
            if(estaOcupado(i) == 0){
              return true;   
            }
        }
        
        return false;
    }
     
    /**
     * Determina el numero del proximo servidor libre
     * 
     * @return Numero del proximo servidor libre, -1 en caso de que no hayan
     * servidores libres
     */
    public int siguienteServidorLibre(){
        for(int i = 0; i < servidores.size(); i++){
            if(estaOcupado(i) == 0){
              return i;   
            }
        }
        
        return -1; //Todos los servidores estan ocupados
    }
    
    public String imprimirDetallesEstatusServidores(){
        String textoStatusServidores = "* Estatus Servidores: \n";
        String cadenaOcupado;
        String cadenaDesocupado = " actualmente desocupado \n";
            
            for(int i = 0; i < servidores.size(); i++){
                cadenaOcupado = " ocupado por el cliente Nº: " + servidores.get(i) + "\n";
                textoStatusServidores+= " -> Servidor: " + (i + 1) + (estaOcupado(i) > 0 ? cadenaOcupado : cadenaDesocupado); 
            }
        
        return textoStatusServidores;
    }
    
    @Override
    public String toString() {
        String salida="";
        
        for(int i = 0; i < servidores.size(); i++){
            salida += "  SS" + (i + 1) + ":" + (estaOcupado(i) > 0 ? "1" : "0");
        }

        return salida;
    }   
}
