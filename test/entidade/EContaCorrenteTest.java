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
        Double result = contaCorrente.getSaldoAtual();
        assertEquals(expResult, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSaldoInicialNulo(){
        System.out.println("Testando caso de testes 02");
        EContaCorrente instance = new EContaCorrente(null);
        Double expResult = null;
        Double result = instance.getSaldoAtual();
        assertEquals(expResult, result); 
        fail("Era esperado um erro que nao aconteceu");
    }
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testSacarNulo(){
        System.out.println("Testando caso de testes 03");
        EContaCorrente instance = new EContaCorrente(null);
        Double expResult = null;
        Double result = instance.getSaldoAtual();
        assertEquals(expResult, result); 
        fail("Era esperado um erro que nao aconteceu");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSacarSaldoInsuficiente(){
        System.out.println("Testando caso de testes 04");
        EContaCorrente instance = new EContaCorrente(null);
        Double expResult = 0.0;
        Double result = instance.getSaldoAtual();
        assertEquals(expResult, result);
        fail("Era esperado um erro que nao aconteceu");
    } 
    
    @Test(expected = IllegalArgumentException.class)
    public void testGit(){
        System.out.println("Testando sincronização com git");
        EContaCorrente instance = new EContaCorrente(null);
        Double expResult = 0.0;
        Double result = instance.getSaldoAtual();
        assertEquals(expResult, result);
        fail("Era esperado um erro que nao aconteceu");
    }
    
}
