
package Componentes;

import java.io.*;
import Utils.MensajeModal;
import Constantes.Constantes;

/**
 * En esta clase se podra gestionar los archivos externos (.txt) que seran
 * usados para la simulacion
 * 
 * @version Nº1 29/12/2020 
 * @author Miguel Valdez
 */
public class AdministradorArchivo {
    private File archivoEntrada;
    private File archivoSalida;
    private String salida;
    
    public AdministradorArchivo() {
        this.archivoEntrada = new File(Constantes.DIRECCION_ARCHIVO_ENTRADA);
        this.archivoSalida = new File(Constantes.DIRECCION_ARCHIVO_SALIDA);
        this.salida = "";
        validarArchivo(this.archivoEntrada);
        validarArchivo(this.archivoSalida);
    }

    /**
     * Regresa el archivo de entrada de datos.
     * 
     * @return Archivo de entrada (actual).
     */
    public File getArchivoEntrada() {
        return archivoEntrada;
    }

    /** 
     * Establece el archivo de entrada de datos.
     * 
     * @param archivoEntrada Archivo de entrada de datos (nuevo).
     */
    public void setArchivoEntrada(File archivoEntrada) {
        this.archivoEntrada = archivoEntrada;
    }

    /**
     * Regresa el archivo de salida de datos.
     * 
     * @return Archivo de salida (actual).
     */
    public File getArchivoSalida() {
        return archivoSalida;
    }

    /** 
     * Establece el archivo de salida de datos.
     * 
     * @param archivoSalida Archivo de salida de datos (nuevo).
     */
    public void setArchivoSalida(File archivoSalida) {
        this.archivoSalida = archivoSalida;
    }

    /**
     * Regresa la cadena de salida.
     * 
     * @return Cadena de salida (actual).
     */
    public String getSalida() {
        return salida;
    }

    /** 
     * Establece la cadena de salida.
     * 
     * @param salida Cadena de salida (nueva).
     */
    public void setSalida(String salida) {
        this.salida = salida;
    }
     
     /**
     * Valida si un archivo existe o no, y en caso de no exista se procede a 
     * crear el mismo.
     * 
     * @param archivo Archivo al que hay que validar.
     * @return Booleano que indica el status de la operacion.
     */
    public boolean validarArchivo(File archivo){
        if(!archivo.exists()){
            try{
               archivo.createNewFile();
            }catch(IOException err){
               MensajeModal.error("No se pudo crear el archivo...");
               return false;
            }    
        }
        
        return true;
    }
    
    /**
     * Lee los datos contenidos dentro del archivo Datos_de_entrada.txt
     * 
     * @param  nombreParametro Nombre del parametro a extraer del archivo.
     * @return La tabla de disitribucion del parametro especificado.
     */
    public TablaDistribucion leerEntrada(String nombreParametro){
        String parametroActualArchivo = "";
        TablaDistribucion tabla = new TablaDistribucion(nombreParametro);
        int valor;
        int porcentaje;
    
        try{
           BufferedReader bf = new BufferedReader(new FileReader(this.archivoEntrada));
           String bfRead;
          
            while((bfRead = bf.readLine()) != null){
               if(bfRead.equals(Constantes.COPY_TELL) || bfRead.equals(Constantes.COPY_TIEMPO_SERVICIO)){
                   parametroActualArchivo = bfRead;
               }else if(parametroActualArchivo.equals(nombreParametro) && !bfRead.equals("")){
                   valor = extraerNumero(bfRead,obtenerPosicion(bfRead));
                   porcentaje = extraerNumero(actualizarLinea(bfRead),obtenerPosicion(actualizarLinea(bfRead)));
                   tabla.agregarProbabilidad(valor, porcentaje);
               }
            }
            
            MensajeModal.info("El parametro: " + nombreParametro.toUpperCase() + " fue leido exitosamente del archivo " + Constantes.NOMBRE_ARCHIVO_ENTRADA);
            
            return tabla;
            
        }catch(IOException err){
            MensajeModal.error("Fallo al leer parametro: " + nombreParametro.toUpperCase() + "\n\n" + "Hubo un error al leer el archivo " +  Constantes.NOMBRE_ARCHIVO_ENTRADA + "...");
        }
        
        return null;
    }
    
    /**
     * Escribe la salida en el archivo Datos_de_salida.txt
     * 
     * @param valor Valor que sera agregado a la salida y sera escrito en el 
     * archivo.
     */
    public void escribirSalida(String valor){
        salida = salida + valor;
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida));
            PrintWriter pw = new PrintWriter(bw);
            pw.write(salida);
            pw.close();
            bw.close();
            MensajeModal.info("El archivo: " + Constantes.NOMBRE_ARCHIVO_SALIDA + " fue actualizado exitosamente!");
        }catch(IOException err){
            MensajeModal.error("Hubo un error durante la escritura en el archivo: " + Constantes.NOMBRE_ARCHIVO_SALIDA + "...");
        }
    }
       
    /**
     * Obtiene la posicion de una cadena en el archivo.
     * 
     * @param linea Linea actual del archivo.
     * @return Posicion de la cadena.
     */
    public int obtenerPosicion(String linea){
        char spc = ' ';
        
        for(int i=0; i < linea.length(); i++){
            if(linea.charAt(i) == spc){
                return i;   
            }
        }
            
        return linea.length();
    }
    
    /**
     * @param linea Linea actual del archivo.
     * @return Nueva linea a ser actualizada.
     */
    public String actualizarLinea(String linea){
        char spc = ' ';
        String newLine;
        
        for(int i=0; i < linea.length(); i++){
            if(linea.charAt(i) == spc){
                return newLine = linea.substring(i + 1);   
            }
        }
        
        return "";
    }
    
    /**
     * Permite extraer un valor o porcentaje del archivo
     * 
     * @param linea Linea actual del archivo
     * @param posicion posicion de la cadena
     * @return Valor o porcentaje del parametro actual
     */
    public int extraerNumero(String linea, int posicion){  
        return Integer.parseInt(linea.substring(0, posicion));
    }
}
