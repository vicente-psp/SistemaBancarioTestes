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
    
}
