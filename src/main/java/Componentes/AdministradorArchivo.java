
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
    private TablaDistribucion tablaTELL;
    private TablaDistribucion tablaTiemposServicio;
    private String salida;
    
    public AdministradorArchivo() {
        this.archivoEntrada = new File(Constantes.DIRECCION_ARCHIVO_ENTRADA);
        this.archivoSalida = new File(Constantes.DIRECCION_ARCHIVO_SALIDA);
        this.tablaTELL = new TablaDistribucion(Constantes.COPY_TELL);
        this.tablaTiemposServicio = new TablaDistribucion(Constantes.COPY_TIEMPO_SERVICIO);
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
     * Actualiza el archivo de entrada de datos.
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
     * Actualiza el archivo de salida de datos.
     * 
     * @param archivoSalida Archivo de salida de datos (nuevo).
     */
    public void setArchivoSalida(File archivoSalida) {
        this.archivoSalida = archivoSalida;
    }

    /**
     * Regresa la tabla de distribucion de tiempos entre llegadas.
     * 
     * @return Tabla de distribucion de tiempos entre llegadas (actual).
     */
    public TablaDistribucion getTablaTELL() {
        return tablaTELL;
    }

    /** 
     * Actualiza la tabla de distribucion de tiempos entre llegadas.
     * 
     * @param tablaTELL Tabla de distribucion de tiempos entre llegadas (nueva).
     */
    public void setTablaTELL(TablaDistribucion tablaTELL) {
        this.tablaTELL = tablaTELL;
    }

     /**
     * Regresa la tabla de distribucion de tiempos de servicio.
     * 
     * @return Tabla de distribucion de tiempos de servicio (actual).
     */
    public TablaDistribucion getTablaTiemposServicio() {
        return tablaTiemposServicio;
    }

    /** 
     * Actualiza la tabla de distribucion de tiempos de servicio.
     * 
     * @param tablaTiemposServicio Tabla de distribucion de tiempos de servicio (nueva).
     */
    public void setTablaTiemposServicio(TablaDistribucion tablaTiemposServicio) {
        this.tablaTiemposServicio = tablaTiemposServicio;
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
     * Actualiza la cadena de salida.
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
     */
    public void leerEntrada(){
        String parametroActual = "";
        boolean hayError = false;
    
        try{
           BufferedReader bf = new BufferedReader(new FileReader(this.archivoEntrada));
           String bfRead;
           int valor;
           int porcentaje;
           TablaDistribucion tabla;
           
            while((bfRead = bf.readLine()) != null){
               if(bfRead.equals(Constantes.COPY_TELL)){
                   parametroActual = "TELL";
               }else if(bfRead.equals(Constantes.COPY_TIEMPO_SERVICIO)){
                   parametroActual = "TS";
               }else if(!bfRead.equals("")){
                   valor = extraerNumero(bfRead,obtenerPosicion(bfRead));
                   porcentaje = extraerNumero(actualizarLinea(bfRead),obtenerPosicion(actualizarLinea(bfRead)));
                   tabla = parametroActual.equals("TELL") ? tablaTELL : tablaTiemposServicio;
                   tabla.agregarProbabilidad(valor, porcentaje);
               }
            }             
        }catch(IOException err){
            hayError = true;
            MensajeModal.error("Hubo un error durante la lectura del archivo: " + Constantes.NOMBRE_ARCHIVO_ENTRADA + "...");
        }
        
        if(!hayError){
            MensajeModal.info("El archivo: " + Constantes.NOMBRE_ARCHIVO_ENTRADA + " fue leido exitosamente!");
        }
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
     * @param linea Linea actual del archivo
     * @param posicion posicion de la cadena
     * @return Valor o porcentaje del parametro actual
     */
    public int extraerNumero(String linea, int posicion){  
        return Integer.parseInt(linea.substring(0, posicion));
    }
}
