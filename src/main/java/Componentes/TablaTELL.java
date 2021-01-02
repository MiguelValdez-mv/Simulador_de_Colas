package Componentes;

import java.util.ArrayList;
import Utils.MensajeModal;

/**
 * Esta clase permitira poder gestionar la tabla de probabilidades de los tiempos 
 * entre llegadas de los clientes en el sistema
 * 
 * @version Nº1 28/12/2020 
 * @author Miguel Valdez
 */
public class TablaTELL {
    private ArrayList<Probabilidad> valoresTELL;
    
    public TablaTELL() {
        this.valoresTELL = new ArrayList<Probabilidad>();
    }
    
    /**
     * Comprueba si un valor de un tiempo entre llegadas no este entre los
     * valores ya registrados en la tabla
     * 
     * @param valor Valor del tiempo entre llegadas a comprobar
     * @return Booleano que indica la existencia (o no) del valor especificado
     */
    public boolean comprobarExistencia(int valor){
        for (Probabilidad tiempoEntreLlegada : valoresTELL) {
            if(valor == tiempoEntreLlegada.getValor())
                return true;
        }
        
        return false;
    }
    
    /**
     * Comprueba que la sumatoria de los porcentajes de los tiempos entre llegadas 
     * ya REGISTRADOS en la tabla sea igual al 100%
     * 
     * @return Booleano que indica si la sumatoria es igual (o no) al 100%
     */
    public boolean porcentajeCompleto(){
        if(valoresTELL.isEmpty())
            return false;
        
        return valoresTELL.get(valoresTELL.size() - 1).getPorcentajeAcum() == 100;
    }
    
    /**
     * Agrega un nuevo tiempo entre llegadas a la tabla 
     * 
     * @param valor Valor del tiempo entre llegadas
     * @param porcentaje Valor del procentaje del tiempo entre llegadas especificado
     */
    public void agregarTELL(int valor, int porcentaje){
        String cadenaError = "Fallo al ingresar parametro: TIEMPO ENTRE LLEGADA (valor: "+ valor +", porcentaje: "+ porcentaje +")\n\n";
        boolean existeValor = comprobarExistencia(valor);
        
        if(0 < porcentaje && porcentaje <= 100 && !existeValor){
            int porcentajeAcum = porcentaje;
            int bordeInferior = 0;
            int bordeSuperior = porcentaje - 1;
            boolean hayDesborde = false;
        
           if(!valoresTELL.isEmpty()){
                Probabilidad probAnterior = valoresTELL.get(valoresTELL.size() - 1);
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
                valoresTELL.add(new Probabilidad(valor, porcentaje, porcentajeAcum, bordeInferior, bordeSuperior));
            }
            
        }else{
            MensajeModal.error(cadenaError + (existeValor ? "Valor ya ingresado con anterioridad..." : "Parametro no valido..."));
        }    
    }
    
     /**
     * Obtiene el valor del tiempo entre llegadas a partir de un numero aleatorio 
     * y la tabla de distribucion de probabilidad
     * 
     * @param aleatorio Valor aleatorio para determinar el tiempo entre llegadas
     * @return Valor del tiempo entre llegadas
     */
    public int getValue(int aleatorio){
        for (Probabilidad tiempoEntreLlegada : valoresTELL) {
            if(tiempoEntreLlegada.getBordeInferior() <= aleatorio && aleatorio <= tiempoEntreLlegada.getBordeSuperior()){
               return tiempoEntreLlegada.getValor();
            }
        }
        
        return 0;
    }
    
    @Override
    public String toString (){
        String cadenaTabla = " Lista tiempo Llegadas: ";
        for (Probabilidad tiempoEntreLlegada : valoresTELL) {
            cadenaTabla = cadenaTabla + "\n  " + tiempoEntreLlegada.toString();
        }

        return cadenaTabla;
    }
}
