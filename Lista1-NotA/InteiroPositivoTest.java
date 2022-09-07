

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste InteiroPositivoTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class InteiroPositivoTest
{
    @Test
    public void test01_Valor_10_Fatorial(){
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(10);
        assertEquals(3628800, ip.fatorial());
    }
    
    @Test
    public void test02_Valor_20_Fatorial(){
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(20);
        assertEquals(2432902008176640000L, ip.fatorial());
    }
    
    @Test
    public void test03_Valor_14_DivisoresInteiros(){
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(14);
        assertEquals("Os divisores inteiros são 1,2,7,14 e a quantidade de divisores é 4", 
                        ip.divisoresInteiros());
    }    
    
    @Test
    public void test04_Valor_18_DivisoresInteiros(){
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(18);
        assertEquals("Os divisores inteiros são 1,2,3,6,9,18 e a quantidade de divisores é 6", 
                        ip.divisoresInteiros());
    }   
    
    @Test
    public void test05_Valor_9_Fibonacci(){
        //Arrange
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(9);
        int[] resultadoEsperado =  {1, 1, 2, 3, 5, 8, 13, 21, 34};
        
        // Act
        int[] resultadoReal = ip.fibonacci();
        
        // Assert
        assertArrayEquals(resultadoEsperado, resultadoReal);
    }   
    
        @Test
    public void test06_Valor_15_Fibonacci(){
        //Arrange
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(15);
        int[] resultadoEsperado =  {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        
        // Act & Assert
        assertArrayEquals(resultadoEsperado,ip.fibonacci());
    }  
}
