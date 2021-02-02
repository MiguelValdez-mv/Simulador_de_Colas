package Componentes;

/**
 *
 * @author miguelandres
 */
public class TuplaDatosCliente {
    private int numCliente;
    private int TELL;
    private int TS;

    public TuplaDatosCliente(int numCliente, int TELL, int TS) {
        this.numCliente = numCliente;
        this.TELL = TELL;
        this.TS = TS;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public int getTELL() {
        return TELL;
    }

    public void setTELL(int TELL) {
        this.TELL = TELL;
    }

    public int getTS() {
        return TS;
    }

    public void setTS(int TS) {
        this.TS = TS;
    }
}