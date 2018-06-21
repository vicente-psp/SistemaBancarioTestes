package entidade;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Vicente
 */
public class EContaCorrenteTest {
    
    private EContaCorrente contaCorrente;
    
    @Before
    public void setUp()throws Exception{
        contaCorrente = new EContaCorrente();
    }
    
    @Test
    public void testGetSaldoAtual() {
        System.out.println("Testando caso de testes 01");
        Double expResult = 0.0;
        Double result = contaCorrente.getSaldo();
        assertEquals(expResult, result);
    }
    
}
