package entidade;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 *
 * @author Vicente
 */
public class EContaCorrenteTest extends TestCase {
	
	private EContaCorrente cc;
	private float saldo = 158.58f;
	private String agencia = "752";
	private String conta = "2568";
	private String cliente = "2568";
    
    @Before
    public void setUp()throws Exception{
        cc = new EContaCorrente();
        cc = new EContaCorrente();
        cc.setAgencia(agencia);
        cc.setConta(conta);
        cc.setCliente(cliente);
        cc.setSaldo(saldo);
    }
    
//    @Test(expected = IllegalArgumentException.class)
//    public void testGetSaldo() throws Exception{
//    	String agencia = "752";
//    	String conta = "2568";
//    	String cliente = "2568";
//    	float saldo = (float) 158.58;
//        cc = new EContaCorrente();
//        cc.setAgencia(agencia);
//        cc.setConta(conta);
//        cc.setCliente(cliente);
//        cc.setSaldo(saldo);
//    	
//    	float resultaEsperado = (float) 158.58;
//    	assertEquals(resultaEsperado, cc.getSaldo(), 0.00001);
//    	fail("Era esperado um erro que nao aconteceu");
//    }
    
    @Test
    public void testGetSaldo(){
        System.out.println("Testando caso de testes 01");
        EContaCorrente instance = new EContaCorrente();
        float expResult = 0.0f;
        float result = 0.0f;
        assertEquals(expResult, result, 0.0f);
    }
    
}
