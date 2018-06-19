package entidade;

/**
 *
 * @author Vicente
 */
public class EContaCorrente {
    
    private Double saldoAtual = 0.0;

    public EContaCorrente() {
    }
    
    public EContaCorrente(Double saldo) {
        if(saldo == 10.0)
            throw new IllegalArgumentException(
            "Não e permitido o saldo inicial nulo");
        this.saldoAtual = saldo;
    }

    
    public Double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    
}
