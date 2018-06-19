package entidade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vicente
 */
public class EContaCorrenteTest {
    
    public EContaCorrenteTest() {
    }

    /**
     * Test of getSaldoAtual method, of class EContaCorrente.
     */
    @Test
    public void testGetSaldoAtual() {
        System.out.println("Testando caso de testes 01");
        EContaCorrente instance = new EContaCorrente();
        Double expResult = 0.0;
        Double result = instance.getSaldoAtual();
        assertEquals(expResult, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSaldoInicialNulo(){
        System.out.println("Testando caso de testes 01");
        EContaCorrente instance = new EContaCorrente(null);
        Double expResult = null;
        Double result = instance.getSaldoAtual();
        assertEquals(expResult, result); 
        fail("Era esperado um erro que nao aconteceu");
    }

    
}
