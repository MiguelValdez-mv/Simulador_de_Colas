package Componentes;

import java.util.ArrayList;
import Utils.MensajeModal;


/**
 * Esta clase permitira poder gestionar la tabla de probabilidades de los tiempos 
 * entre llegadas o los tiempos de servicio de los clientes en el sistema.
 * 
 * @version Nº1 28/12/2020.
 * @author Miguel Valdez.
 */
public class TablaDistribucion {
    private ArrayList<Probabilidad> listaProbabilidades;
    private String nombreParametro;

    public TablaDistribucion(String nombreParametro) {
        this.listaProbabilidades = new ArrayList<>();
        this.nombreParametro = nombreParametro;
    }
    
    /**
     * Regresa la tabla de distribucion.
     * 
     * @return Tabla de distribucion (actual).
     */
    public ArrayList<Probabilidad> getListaProbabilidades() {
        return listaProbabilidades;
    }

    /** 
     * Actualiza la tabla de distribucion.
     * 
     * @param listaProbabilidades Tabla de distribucion (nueva).
     */
    public void setListaProbabilidades(ArrayList<Probabilidad> listaProbabilidades) {
        this.listaProbabilidades = listaProbabilidades;
    }

    /**
     * Regresa el nombre del parametro.
     * 
     * @return Nombre del parametro (actual).
     */
    public String getNombreParametro() {
        return nombreParametro;
    }

    /** 
     * Actualiza el nombre del parametro.
     * 
     * @param listaProbabilidades nombre del parametro (nuevo).
     */
    public void setNombreParametro(String nombreParametro) {
        this.nombreParametro = nombreParametro;
    }
    
    /**
     * Comprueba si un valor esta (o no) registrado en la tabla.
     * 
     * @param valor Valor (del tiempo entre llegadas o tiempo de servicio) a comprobar.
     * @return Booleano que indica la existencia (o no) del valor especificado.
     */
    public boolean comprobarExistencia(int valor){
        for (Probabilidad probabilidad : listaProbabilidades) {
            if(valor == probabilidad.getValor())
                return true;
        }
        
        return false;
    }
    
    /**
     * Comprueba si el porcentaje acumulado ACTUAL de la tabla es del 100%.
     * 
     * @return Booleano que indica si el porcentaje acumulado es igual (o no)
     * al 100%.
     */
    public boolean hayPorcentajeCompleto(){
        if(listaProbabilidades.isEmpty())
            return false;
        
        return listaProbabilidades.get(listaProbabilidades.size() - 1).getPorcentajeAcum() == 100;
    }
    
    /**
     * Agrega una nueva probabilidad a la tabla.
     * 
     * @param valor Valor (del tiempo entre llegadas o tiempo de servicio).
     * @param porcentaje Porcentaje (del tiempo entre llegadas o tiempo de servicio).
     */
    public void agregarProbabilidad(int valor, int porcentaje){
        String cadenaError = "Fallo al ingresar parametro: " + nombreParametro.toUpperCase() + " (valor: " + valor + ", porcentaje: " + porcentaje + ")\n\n";
        boolean existeValor = comprobarExistencia(valor);
        
        if(0 < porcentaje && porcentaje <= 100 && !existeValor){
            int porcentajeAcum = porcentaje;
            int bordeInferior = 0;
            int bordeSuperior = porcentaje - 1;
            boolean hayDesborde = false;
        
           if(!listaProbabilidades.isEmpty()){
                Probabilidad probAnterior = listaProbabilidades.get(listaProbabilidades.size() - 1);
                porcentajeAcum = probAnterior.getPorcentajeAcum() + porcentaje;
                
                if(porcentajeAcum <= 100){
                    bordeInferior = probAnterior.getBordeSuperior() + 1;
                    bordeSuperior = porcentajeAcum - 1; 
                }else{
                    hayDesborde = true;
                    MensajeModal.error(cadenaError + "Sobrepasa el porcentaje acumulado actual...");
                }
            }
            
            if(!hayDesborde){
                listaProbabilidades.add(new Probabilidad(valor, porcentaje, porcentajeAcum, bordeInferior, bordeSuperior));
            }
            
        }else{
            MensajeModal.error(cadenaError + (existeValor ? "Valor ya ingresado con anterioridad..." : "Parametro no valido..."));
        }    
    }
    
     /**
     * Obtiene un valor a partir de un numero aleatorio y la tabla de 
     * distribucion de probabilidades.
     * 
     * @param aleatorio Valor aleatorio. 
     * @return Valor (del tiempo entre llegadas o tiempo de servicio).
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
