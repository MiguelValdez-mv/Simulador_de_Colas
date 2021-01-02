package Componentes;

/**
 * En esta clase se va a poder manejar los valores probabilisticos existentes entre
 * los tiempos de llegadas y tiempos de servicios, es decir, se podra tener un control 
 * de estas para poder determinar el porcentaje de su probabilidad, porcentaje de su 
 * probabilidad acumulada y sus bordes (tanto inferior como superior).
 * 
 * @version Nº1 28/12/2020 
 * @author Miguel Valdez
 */
public class Probabilidad {
    private int valor;
    private int porcentaje;
    private int porcentajeAcum;
    private int bordeSuperior;
    private int bordeInferior;
    
    /**
     * @param valor Valor del tiempo de servicio o entre llegadas
     * @param porcentaje Procentaje del valor
     * @param porcentajeAcum Porcentaje acumulado del valor con respecto a los demas
     * @param bordeInferior Borde inferior para el valor 
     * @param bordeSuperior Borde superior para el valor 
     */
    public Probabilidad(int valor, int porcentaje, int porcentajeAcum, int bordeInferior, int bordeSuperior) {
        this.valor = valor;
        this.porcentaje = porcentaje;
        this.porcentajeAcum = porcentajeAcum;
        this.bordeInferior = bordeInferior;
        this.bordeSuperior =  bordeSuperior;
    }

    /**
     * Regresa el valor del tiempo de servicio o entre llegadas
     * 
     * @return Valor (actual) del tiempo de servicio o entre llegadas
     */
    public int getValor() {
        return valor;
    }

    /** 
     * Actualiza el valor del tiempo de servicio o entre llegadas
     * 
     * @param valor Valor (nuevo) del tiempo de servicio o entre llegadas
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Regresa el porcentaje del valor del tiempo de servicio o entre llegadas
     * 
     * @return Porcentaje (actual) del valor del tiempo de servicio o entre llegadas
     */
    public int getPorcentaje() {
        return porcentaje;
    }

    /** 
     * Actualiza el porcentaje del valor del tiempo de servicio o entre llegadas
     * 
     * @param porcentaje Porcentaje (nuevo) del valor del tiempo de servicio o entre llegadas
     */
    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    /**
     * Regresa el porcentaje acumulado del valor del tiempo de servicio o entre llegadas
     * 
     * @return Porcentaje acumulado (actual) del valor del tiempo de servicio o entre llegadas
     */
    public int getPorcentajeAcum() {
        return porcentajeAcum;
    }

    /** 
     * Actualiza el porcentaje acumulado del valor del tiempo de servicio o entre llegadas
     * 
     * @param porcentajeAcum Porcentaje acumulado (nuevo) del valor del tiempo de servicio o entre llegadas
     */
    public void setPorcentajeAcum(int porcentajeAcum) {
        this.porcentajeAcum = porcentajeAcum;
    }

    
    /**
     * Regresa el valor del borde inferior del tiempo de servicio o entre llegadas
     * 
     * @return Valor del borde inferior (actual) del tiempo de servicio o entre llegadas
     */
    public int getBordeInferior() {
        return bordeInferior;
    }

    /** 
     * Actualiza el valor del borde inferior del tiempo de servicio o entre llegadas
     * 
     * @param bordeInferior Valor del borde inferior (nuevo) del tiempo de servicio o entre llegadas
     */
    public void setBordeInferior(int bordeInferior) {
        this.bordeInferior = bordeInferior;
    }
    
    /**
     * Regresa el valor del borde superior del tiempo de servicio o entre llegadas
     * 
     * @return Valor del borde superior (actual) del tiempo de servicio o entre llegadas
     */
    public int getBordeSuperior() {
        return bordeSuperior;
    }

    /** 
     * Actualiza el valor del borde superior del tiempo de servicio o entre llegadas
     * 
     * @param bordeSuperior Valor del borde superior (nuevo) del tiempo de servicio o entre llegadas
     */
    public void setBordeSuperior(int bordeSuperior) {
        this.bordeSuperior = bordeSuperior;
    }
    
    @Override
    public String toString() {
        return "Valor: " + valor + " Porcentaje: " + porcentaje + " Porcentaje acum: " + porcentajeAcum + " Intervalo: |" + bordeInferior + "," + bordeSuperior + "|";
    }
}
