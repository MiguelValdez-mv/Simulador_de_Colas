package Utils;

import java.util.Random;

/**
 * Esta clase se utilizara para generar numeros aleatorios
 * 
 * @version Nº1 02/02/2020
 * @author Miguel Valdez
 */
public class Aleatorio {
    
    private int semilla;
    
    /**
     * Utilizado para generar una secuencia aleatoria con una semilla dada
     * @param semilla
     */
    public Aleatorio(int semilla) {
        this.semilla = semilla;
    }
    
    /**
     * Utilizado para generar numeros completamente aleatorios
     */
    public Aleatorio() {
        this.semilla =(int) (Math.random()*100);
    }
  
    /**
     * Genera un numero aleatorio (entre 0 y 99) a partir de la semilla
     * @return Numero aleatorio
     */
    public int generarAleatorioSemilla(){ 
        Random numAleatorio = new Random();
        
        numAleatorio.setSeed(semilla);
        semilla = numAleatorio.nextInt(100);
        
        return semilla;
    }
    
     /**
     * Genera un numero aleatorio (entre 0 y 99)
     * @return Numero Aleatorio
     */
    public int generarAleatorio(){ 
        Random numAleatorio = new Random();
        
        numAleatorio.setSeed(semilla);
        semilla = (int) (Math.random()*100);
        
        return numAleatorio.nextInt(100);
    }
}
