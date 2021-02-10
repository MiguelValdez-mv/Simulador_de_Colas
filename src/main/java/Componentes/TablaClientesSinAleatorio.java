/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.util.ArrayList;

/**
 *
 * @author miguelandres
 */
public class TablaClientesSinAleatorio {
     private ArrayList<ClienteSinAleatorio> clientes;

    public TablaClientesSinAleatorio() {
        this.clientes = new ArrayList<>();
    }
    
    public void añadirCliente(int tiempoEntreLlegadas, int tiempoServicio){
        //Obtenemos el ultimo numero de cliente registrado en el sistema
        int numCliente = clientes.isEmpty() ? 1 : clientes.get(clientes.size() - 1).getNumCliente() + 1;
        
        //Agregamos al cliente
        clientes.add(new ClienteSinAleatorio(numCliente, tiempoEntreLlegadas, tiempoServicio));
    }
    
    public ClienteSinAleatorio buscarCliente(int numCliente){
        for(ClienteSinAleatorio cliente: clientes){
            if(cliente.getNumCliente() == numCliente){
                return cliente;
            }
        }
  
        return null;
    }
    
    public boolean noHayClientesEnSistema(){
        return clientes.isEmpty();
    }
    
    @Override
    public String toString() {
        String salida = "Tabla de datos de clientes en sistema : \n";
        ClienteSinAleatorio cliente;
        
        for(int i = 0; i < clientes.size(); i++){
            cliente = clientes.get(i);
            salida += " -> NumCliente: " + cliente.getNumCliente() + ", TiempoEntreLlegadas: " + cliente.getTiempoEntreLlegadas() + ", TiempoServicio: " + cliente.getTiempoServicio() + "\n";
        }

        return salida;
    }   
}
