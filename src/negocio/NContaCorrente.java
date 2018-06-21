package negocio;

import entidade.EContaCorrente;

/**
 *
 * @author Vicente
 */
public class NContaCorrente {
    
    public void depositar(EContaCorrente conta, float valor) throws Exception{
        conta.setSaldo(conta.getSaldo() + valor);
    }
    
    public void sacar(EContaCorrente conta, float valor)throws Exception{
        if(valor <= 0)
            throw new Exception("Valor deve ser maior que zero.");
        if(conta.getSaldo() < valor)
            throw new Exception("Saldo insuficiente");
        conta.setSaldo(conta.getSaldo() - valor);
    }
    
}
