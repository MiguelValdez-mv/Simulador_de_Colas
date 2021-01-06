package Principal;

import GUI.ParametrosDeEntrada;
import GUI.ParametrosDeSalida;

/**
 * Esta sera la clase principal del proyecto
 * 
 * @version Nº1 28/12/2020
 * @author Miguel Valdez
 */
public class Principal {
    
    /**
     * Aqui se dara inicio a la ejecucion del proyecto
     * 
     * @param args Argumentos de la linea de comandos
     */
    public static void main(String[] args) {
       ParametrosDeEntrada parametrosEntrada = new ParametrosDeEntrada();
       parametrosEntrada.setVisible(true);
    }    
}
