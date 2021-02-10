/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

/**
 *
 * @author miguelandres
 */
public class ClienteSinAleatorio {
    private int numCliente;
    private int tiempoEntreLlegadas;
    private int tiempoServicio;

    public ClienteSinAleatorio(int numCliente, int tiempoEntreLlegadas, int tiempoServicio) {
        this.numCliente = numCliente;
        this.tiempoEntreLlegadas = tiempoEntreLlegadas;
        this.tiempoServicio = tiempoServicio;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public int getTiempoEntreLlegadas() {
        return tiempoEntreLlegadas;
    }

    public void setTiempoEntreLlegadas(int tiempoEntreLlegadas) {
        this.tiempoEntreLlegadas = tiempoEntreLlegadas;
    }

    public int getTiempoServicio() {
        return tiempoServicio;
    }

    public void seTtiempoServicio(int tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }
}
