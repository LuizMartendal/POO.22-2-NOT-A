import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VetorDeReaisTest {

	@Test
	void test01_DivideNull() {
		// Arrange
		VetorDeReais vr1 = new VetorDeReais(3);
		vr1.setValor(2, 0);
		vr1.setValor(-1, 1);
		vr1.setValor(3.5, 2);
		
		VetorDeReais vr2 = new VetorDeReais(1);
		vr2.setValor(3, 0);
		
		// Act & Assert
		assertNull(vr1.divide(vr2));
	}
	
	@Test
	void test02_DivideValido() {
		// Arrange
		VetorDeReais vr1 = new VetorDeReais(3);
		vr1.setValor(2, 0);
		vr1.setValor(-1, 1);
		vr1.setValor(3.5, 2);
		
		VetorDeReais vr2 = new VetorDeReais(3);
		vr2.setValor(3, 0);
		vr2.setValor(2, 1);
		vr2.setValor(1, 2);
		double[] divide = {0.666666, -0.5 , 3.5 };
		
		// Act
		VetorDeReais vr3 = vr1.divide(vr2);
		
		//Assert
		for (int i=0; i < vr3.getTamanho(); i++) {
			assertEquals(divide[i], vr3.getValor(i), 0.000001);
		}
		
		// outra forma
		VetorDeReais vr4 = new VetorDeReais(3);
		vr4.setValor(0.6666666666666666, 0);
		vr4.setValor(-0.5, 1);
		vr4.setValor(3.5, 2);
		assertEquals(vr4.exibir(), vr3.exibir());
	}

}
