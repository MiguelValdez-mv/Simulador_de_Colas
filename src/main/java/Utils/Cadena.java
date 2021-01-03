package Utils;

/**
 * En esta clase estaran todas las "funciones de utilidad" usadas para los strings.
 * 
 * @version Nº1 28/12/2020. 
 * @author Miguel Valdez.
 */
public class Cadena {
       
    /**
     * Modifica un string que haga referencia a una unidad de tiempo, eliminando su sufijo.
     * 
     * @param cadena
     * @return Una cadena nueva sin el sufijo especificado.
     */
    public static String extraerSufijoUnidadTiempo(String cadena){
        return cadena.substring(0, cadena.length() - (cadena.endsWith("es") ? 2 : 1));
    }
}
