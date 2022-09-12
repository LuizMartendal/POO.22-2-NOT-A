import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContribuinteTest {

	@Test
	void test06_SetUf_SC_Válido() {
		// Arrange & Act 
		Contribuinte c = new Contribuinte("Joao","123","SC",3000);
		//Assert
		assertEquals("SC",c.getUf());
	}

	@Test
	void test07_SetUf_PR_Válido() {
		// Arrange & Act 
		Contribuinte c = new Contribuinte("Joao","123","PR",3000);
		//Assert
		assertEquals("PR",c.getUf());
	}

	@Test
	void test08_SetUf_RS_Válido() {
		// Arrange & Act 
		Contribuinte c = new Contribuinte("Joao","123","RS",3000);
		//Assert
		assertEquals("RS",c.getUf());
	}
	
	@Test
	void test09_SetUf_SP_Inválido() {
		// Arrange  
		Contribuinte c = new Contribuinte("Joao","123","SC",3000);
		// Act 
		c.setUf("SP");
		//Assert
		assertEquals("SC",c.getUf());
	}
	
	@Test
	void test10_SetUf_RJ_Inválido() {
		// Arrange  
		Contribuinte c = new Contribuinte("Joao","123","SC",3000);
		// Act 
		c.setUf("RJ");
		//Assert
		assertEquals("SC",c.getUf());
	}
	
	@Test
	void test05_SetRendaAnualNegativa() {
		// Arrange
		Contribuinte c = new Contribuinte("Joao","123","SC",3000);
		// Act
		c.setRendaAnual(-818.5);
		//Assert
		assertEquals(3000,c.getRendaAnual());
	}

	@Test
	void test01_CalcularImposto_Renda3000_ImpostoZero() {
		//Arrange
		Contribuinte c = new Contribuinte("Joao","123","SC",3000);
		
		// Act
		double imposto = c.calcularImposto();
		
		//Assert
		assertEquals(0.0,imposto);
	}
	
	@Test
	void test02_CalcularImposto_Renda9000_Imposto522() {
		//Arrange
		Contribuinte c = new Contribuinte("Joao","123","SC",9000);
		
		// Act
		double imposto = c.calcularImposto();
		
		//Assert
		assertEquals(522.0,imposto);
	}

	@Test
	void test03_CalcularImposto_Renda10000_Imposto1500() {
		//Arrange
		Contribuinte c = new Contribuinte("Joao","123","SC",10000);
		
		// Act & Assert
		assertEquals(1500.0,c.calcularImposto());
	}

	@Test
	void test04_CalcularImposto_Renda34911_Imposto9600() {
		//Arrange
		Contribuinte c = new Contribuinte("Joao","123","SC",34911.73);
		
		// Act & Assert
		assertEquals(9600.72,c.calcularImposto(), 0.009);
	}

}
