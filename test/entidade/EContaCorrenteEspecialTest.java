package entidade;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Vicente
 *
 */
public class EContaCorrenteEspecialTest {
    
    public static EContaCorrenteEspecial conta;
    
    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        conta = new EContaCorrenteEspecial();
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for {@link entidade.EContaCorrenteEspecial#getLimite()}.
     */
    @Test
    public void testGetLimite() {
        try {
            conta.getLimite();
        } catch (Exception e) {
            fail("Teste falhou");
        }
    }

    /**
     * Test method for
     * {@link entidade.EContaCorrenteEspecial#setLimite(java.lang.String)}.
     */
    @Test
    public void testSetLimite() {
        try {
            conta.setLimite(0.0);
        } catch (Exception e) {
            fail("Teste falhou");
        }
    }

}
