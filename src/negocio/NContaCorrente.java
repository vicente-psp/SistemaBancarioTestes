package negocio;

import entidade.EContaCorrente;

/**
 *
 * @author Vicente
 */
public class NContaCorrente {
    
    public void depositar(EContaCorrente conta, Double valor){
        conta.setSaldoAtual(conta.getSaldoAtual() + valor);
    }
    
    public void sacar(EContaCorrente conta, Double valor)throws Exception{
        if(valor == null)
            throw new Exception("Valor inválido.");
        if(valor <= 0)
            throw new Exception("Valor deve ser maior que zero.");
        if(conta.getSaldoAtual() < valor)
            throw new Exception("Saldo insuficiente");
        conta.setSaldoAtual(conta.getSaldoAtual() - valor);
    }
    
}
