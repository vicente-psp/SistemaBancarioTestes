package negocio;

import entidade.EContaCorrente;
import persistencia.PHistoricoMovimentacao;

/**
 *
 * @author Vicente
 */
public class NHistoricoMovimentacao {
    
    PHistoricoMovimentacao persistencia;

    public NHistoricoMovimentacao(PHistoricoMovimentacao persistencia) {
        this.persistencia = persistencia;
    }
    
    public boolean registrar(EContaCorrente conta, String descircao){
        return this.persistencia.registrar(conta, descircao);
    }
    
}
