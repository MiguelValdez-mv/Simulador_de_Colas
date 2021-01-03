package Utils;

/**
 * En esta clase estaran todas las "funciones de utilidad" usadas para los numeros
 * 
 * @version Nº1 28/12/2020
 * @author Miguel Valdez
 */
public class Numero {
    
    /**
     * Verifica si una cadena es un numero
     * 
     * @param cadena
     * @return Booleano que indica si la cadena es un numero
     */
    public static boolean esNumero(String cadena) {
        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException err) {
            resultado = false;
        }

        return resultado;
    }
}
