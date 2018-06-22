package negocio;

import entidade.EContaCorrente;
import entidade.EContaCorrenteEspecial;
import junit.framework.TestCase;

/**
 *
 * @author Vicente
 */
public class NContaCorrenteEspecialTest extends TestCase {
    
    public NContaCorrenteEspecialTest(String testName) {
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
     * Test of depositar method, of class NContaCorrenteEspecial.
     */
    public void testDepositar() throws Exception {
        System.out.println("depositar");
        EContaCorrente conta = null;
        float valor = 0.0F;
        NContaCorrenteEspecial instance = new NContaCorrenteEspecial();
        instance.depositar(conta, valor);
        fail("Teste falhou.");
    }

    /**
     * Test of sacar method, of class NContaCorrenteEspecial.
     */
    public void testSacar() throws Exception {
        System.out.println("sacar");
        EContaCorrenteEspecial conta = null;
        float valor = 0.0F;
        NContaCorrenteEspecial instance = new NContaCorrenteEspecial();
        instance.sacar(conta, valor);
        fail("Teste falhou.");
    }
    
}
