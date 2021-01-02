package Utils;

import javax.swing.JOptionPane;

/**
 * En esta clase estaran todas las "funciones de utilidad" usadas para mostrar mensajes al usuario
 * 
 * @version Nº1 28/12/2020 
 * @author Miguel Valdez
 */
public class MensajeModal {
    
    /**
     * Abre un modal con un mensaje de INFORMACION dirigido al usuario
     * 
     * @param mensaje
     */
    public static void info(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Abre un modal con un mensaje de ERROR dirigido al usuario
     * 
     * @param mensaje
     */
    public static void error(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "¡Error!", JOptionPane.WARNING_MESSAGE);
    }
}
