package entidade;

/**
 *
 * @author Vicente
 */
public class EContaCorrente {
    private String agencia;
    private String conta;
    private String cliente;
    private Double saldo;

    public EContaCorrente() {}

    public EContaCorrente(String agencia, String conta, String cliente, Double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia)throws Exception{
        if(agencia.equals(""))
            throw new Exception("Agência é obrigatórcio");
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) throws Exception {
        if(conta.equals(""))
            throw new Exception("Conta é obrigatórcio");
        this.conta = conta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) throws Exception {
        if(cliente.equals(""))
            throw new Exception("Conta é obrigatórcio");
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) throws Exception {
        if(saldo < 0)
            throw new Exception("Saldo não pode ser negativo");
        this.saldo = saldo;
    }
    
}
