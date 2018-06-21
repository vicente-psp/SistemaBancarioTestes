package entidade;

/**
 *
 * @author Vicente
 */
public class EContaCorrenteEspecial extends EContaCorrente {

    private Double limite;

    public EContaCorrenteEspecial() {
    }

    public EContaCorrenteEspecial(Double limite, String agencia, String conta, String cliente, Double saldo) {
        super(agencia, conta, cliente, saldo);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite)throws Exception{
        if(limite < 0)
            throw new Exception("Limite não pode ser negativo");
        this.limite = limite;
    }

}
