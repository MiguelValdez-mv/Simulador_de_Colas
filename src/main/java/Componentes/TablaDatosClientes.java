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
public class TablaDatosClientes {
    private ArrayList<TuplaDatosCliente> datosCliente;

    public TablaDatosClientes() {
        this.datosCliente = new ArrayList<>();
    }
    
    public void añadirCliente(int numCliente, int TELL, int TS){
        datosCliente.add(new TuplaDatosCliente(numCliente, TELL, TS));
    }
    
    public TuplaDatosCliente buscarCliente(int numCliente){
        for(TuplaDatosCliente tupla: datosCliente){
            if(tupla.getNumCliente() == numCliente){
                return tupla;
            }
        }
        
        return null;
    }
}
