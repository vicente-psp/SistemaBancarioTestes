package negocio;

import entidade.EContaCorrente;
import junit.framework.TestCase;

/**
 *
 * @author Vicente
 */
public class NContaCorrenteTest extends TestCase {
    
    public NContaCorrenteTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of depositar method, of class NContaCorrente.
     */
    public void testDepositar() throws Exception {
        System.out.println("depositar");
        EContaCorrente conta = null;
        float valor = 0.0F;
        NContaCorrente instance = new NContaCorrente();
        instance.depositar(conta, valor);
        fail("Teste falhou.");
    }

    /**
     * Test of sacar method, of class NContaCorrente.
     */
    public void testSacar() throws Exception {
        System.out.println("sacar");
        EContaCorrente conta = null;
        float valor = 0.0F;
        NContaCorrente instance = new NContaCorrente();
        instance.sacar(conta, valor);
        fail("Teste falhou.");
    }
    
}
