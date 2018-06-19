package negocio;

import entidade.EContaCorrente;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import persistencia.PHistoricoMovimentacao;

/**
 *
 * @author Vicente
 */
public class NHistoricoMovimentacaoTest {
    
    @Mock
    PHistoricoMovimentacao persistencia;
    
    public NHistoricoMovimentacaoTest() {
    }

    /**
     * Test of registrar method, of class NHistoricoMovimentacao.
     */
    @Test
    public void testRegistrar() {
        System.out.println("registrar");
        EContaCorrente conta = new EContaCorrente();
        String descircao = "";
        
        persistencia = Mockito.mock(PHistoricoMovimentacao.class, descircao);
        NHistoricoMovimentacao instance = new NHistoricoMovimentacao(persistencia);
        
        when(persistencia.registrar(conta, descircao)).thenReturn(true);
        
        boolean expResult = true;
        boolean result = instance.registrar(conta, descircao);
        assertEquals(expResult, result);
    }
    
}
