package negocio;

import entidade.EContaCorrente;
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
public class NContaCorrente {

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
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
     * Test method for {@link entidade.EContaCorrente#getAgencia()}.
     */
    @Test
    public void testdepositar() {
        try {
            NContaCorrente conta = new NContaCorrente();
            
        } catch (Exception e) {
            fail("Teste falhou");
        }
    }

    /**
     * Test method for
     * {@link entidade.EContaCorrente#setAgencia(java.lang.String)}.
     */
    @Test
    public void testSetAgencia() {
        try {
            EContaCorrente cc = new EContaCorrente();
            cc.setAgencia("123456-X");
        } catch (Exception e) {
            fail("Teste falhou");
        }
    }

    /**
     * Test method for {@link entidade.EContaCorrente#getConta()}.
     */
    @Test
    public void testGetConta() {
        try {
            EContaCorrente cc = new EContaCorrente();
            cc.getConta();
        } catch (Exception e) {
            fail("Teste falhou");
        }
    }

    /**
     * Test method for
     * {@link entidade.EContaCorrente#setConta(java.lang.String)}.
     */
    @Test
    public void testSetConta() {
        try {
            EContaCorrente cc = new EContaCorrente();
            cc.setConta("123456");
        } catch (Exception e) {
            fail("Teste falhou");
        }
    }

    /**
     * Test method for {@link entidade.EContaCorrente#getCliente()}.
     */
    @Test
    public void testGetCliente() {
        try {
            EContaCorrente cc = new EContaCorrente();
            cc.getCliente();
        } catch (Exception e) {
            fail("Teste falhou");
        }
    }

    /**
     * Test method for
     * {@link entidade.EContaCorrente#setCliente(java.lang.String)}.
     */
    @Test
    public void testSetCliente() {
        try {
            EContaCorrente cc = new EContaCorrente();
            cc.setCliente("João");
        } catch (Exception e) {
            fail("Teste falhou");
        }
    }

    /**
     * Test method for {@link entidade.EContaCorrente#getSaldo()}.
     */
    @Test
    public void testGetSaldo() {
        try {
            EContaCorrente cc = new EContaCorrente();
            cc.getSaldo();
        } catch (Exception e) {
            fail("Teste falhou");
        }
    }

    /**
     * Test method for {@link entidade.EContaCorrente#setSaldo(float)}.
     */
    @Test
    public void testSetSaldo() {
        try {
            EContaCorrente cc = new EContaCorrente();
            cc.setSaldo(0.0f);
        } catch (Exception e) {
            fail("Teste falhou");
        }

    }

}
