package Componentes;

import java.util.ArrayList;
import Utils.MensajeModal;


/**
 * Esta clase permitira poder gestionar la tabla de probabilidades de los tiempos 
 * entre llegadas o los tiempos de servicio de los clientes en el sistema
 * 
 * @version Nº1 28/12/2020
 * @author Miguel Valdez
 */
public class TablaDistribucion {
    private ArrayList<Probabilidad> listaProbabilidades;
    private String nombreParametro;

    public TablaDistribucion(String nombreParametro) {
        this.listaProbabilidades = new ArrayList<>();
        this.nombreParametro = nombreParametro;
    }
    
    /**
     * Regresa la tabla de distribucion
     * 
     * @return Tabla de distribucion (actual)
     */
    public ArrayList<Probabilidad> getListaProbabilidades() {
        return listaProbabilidades;
    }

    /** 
     * Establece la tabla de distribucion
     * 
     * @param listaProbabilidades Tabla de distribucion (nueva)
     */
    public void setListaProbabilidades(ArrayList<Probabilidad> listaProbabilidades) {
        this.listaProbabilidades = listaProbabilidades;
    }

    /**
     * Regresa el nombre del parametro
     * 
     * @return Nombre del parametro (actual)
     */
    public String getNombreParametro() {
        return nombreParametro;
    }

    /** 
     * Establece el nombre del parametro
     * 
     * @param nombreParametro nombre del parametro (nuevo)
     */
    public void setNombreParametro(String nombreParametro) {
        this.nombreParametro = nombreParametro;
    }
    
    /**
     * Comprueba si un valor esta (o no) registrado en la tabla
     * 
     * @param valor Valor (del tiempo entre llegadas o tiempo de servicio) a comprobar
     * @return Booleano que indica la existencia (o no) del valor especificado
     */
    public boolean comprobarExistencia(int valor){
        for (Probabilidad probabilidad : listaProbabilidades) {
            if(valor == probabilidad.getValor())
                return true;
        }
        
        return false;
    }
    
    /**
     * Retorna el porcentaje acumulado actual de la tabla
     * 
     * @return Porcentaje acumulado
     */
    public int getPorcentajeAcum(){
        if(listaProbabilidades.isEmpty())
            return 0;
         
        return listaProbabilidades.get(listaProbabilidades.size() - 1).getPorcentajeAcum();
    }
    
    /**
     * Comprueba si el porcentaje acumulado ACTUAL de la tabla es del 100%
     * 
     * @return Booleano que indica si el porcentaje acumulado es igual (o no) al 100%
     */
    public boolean hayPorcentajeCompleto(){
        return getPorcentajeAcum() == 100;
    }
    
    /**
     * Agrega una nueva probabilidad a la tabla
     * 
     * @param valor Valor (del tiempo entre llegadas o tiempo de servicio)
     * @param porcentaje Porcentaje (del tiempo entre llegadas o tiempo de servicio)
     * @return Booleano que indicara el status de la operacion: true - exitosa, 
     * false - error
     */
    public boolean agregarProbabilidad(int valor, int porcentaje){
        String cadenaError = "Fallo al ingresar parametro: " + nombreParametro.toUpperCase() + " (valor: " + valor + ", porcentaje: " + porcentaje + ")\n\n";
        boolean existeValor = comprobarExistencia(valor);
        boolean porcentajeValido = 0 < porcentaje && porcentaje <= 100;
        
        if(porcentajeValido && !existeValor){
            int porcentajeAcum = porcentaje;
            int bordeInferior = 0;
            int bordeSuperior = porcentaje - 1;
        
           if(!listaProbabilidades.isEmpty()){
                Probabilidad probAnterior = listaProbabilidades.get(listaProbabilidades.size() - 1);
                porcentajeAcum = probAnterior.getPorcentajeAcum() + porcentaje;
                
                if(porcentajeAcum <= 100){
                    bordeInferior = probAnterior.getBordeSuperior() + 1;
                    bordeSuperior = porcentajeAcum - 1; 
                }else{
                    MensajeModal.error(cadenaError + "Sobrepasa el porcentaje acumulado actual...");
                    
                    return false;
                }
            }
            
            listaProbabilidades.add(new Probabilidad(valor, porcentaje, porcentajeAcum, bordeInferior, bordeSuperior));
            
            return true;
        }else{
            if(!porcentajeValido){
                MensajeModal.error(cadenaError + "Parametro no valido...");
            }
            
            if(existeValor){
                MensajeModal.error(cadenaError + "Valor ya ingresado con anterioridad...");
            }
        }    
    
        return false;
    }
    
    
    /**
     * Obtiene un valor a partir de un numero aleatorio y la tabla de 
     * distribucion de probabilidades
     * 
     * @param aleatorio Valor aleatorio. 
     * @return Valor (del tiempo entre llegadas o tiempo de servicio)
     */
    public int obtenerValor(int aleatorio){
        for (Probabilidad probabilidad : listaProbabilidades) {
            if(probabilidad.getBordeInferior() <= aleatorio && aleatorio <= probabilidad.getBordeSuperior()){
               return probabilidad.getValor();
            }
        }
        
        return 0;
    }
    
    @Override
    public String toString (){
        String cadenaTabla = "Tabla de distribucion " + nombreParametro.toLowerCase()  + ":\n";
        for (Probabilidad probabilidad : listaProbabilidades) {
            cadenaTabla = cadenaTabla + "\n" + probabilidad.toString();
        }

        return cadenaTabla;
    }
}
