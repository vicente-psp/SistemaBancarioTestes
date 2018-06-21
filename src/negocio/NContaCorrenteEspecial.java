package negocio;

import entidade.EContaCorrente;
import entidade.EContaCorrenteEspecial;

/**
 *
 * @author Vicente
 */
public class NContaCorrenteEspecial {
    
    public void depositar(EContaCorrente conta, float valor) throws Exception{
        conta.setSaldo(conta.getSaldo() + valor);
    }
    
    public void sacar(EContaCorrenteEspecial conta, float valor) throws Exception {
        if (valor > (conta.getSaldo() + conta.getLimite())) {
            throw new Exception("Saldo insuficiente");
        }
        if (valor > conta.getSaldo()) {
            valor -= conta.getSaldo();
            conta.setSaldo(0.0f);
            conta.setLimite(conta.getLimite() - valor);
        }else{
            conta.setSaldo(conta.getSaldo() - valor);
        }
    }
    
}
