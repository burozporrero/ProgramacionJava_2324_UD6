package teoria.jerarquia.ejemplo_empresa;

public class Cliente extends  Persona{
    private int numeroCliente;
    private boolean esClienteOro;

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public boolean isEsClienteOro() {
        return esClienteOro;
    }

    public void setEsClienteOro(boolean esClienteOro) {
        this.esClienteOro = esClienteOro;
    }
}
