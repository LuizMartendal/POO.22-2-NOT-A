import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class DataAgendaTest {

	@Test
	void test01AddCompromissoValido() {
		DataAgenda dia = new DataAgenda();
		dia.setData(LocalDate.of(2022, 9, 19));
		
		Compromisso c1 = new Compromisso(LocalTime.of(12, 0), 
										"Almoço", 90, 'N');
		dia.addCompromisso(c1);
		
		Compromisso c2 = new Compromisso(LocalTime.of(12, 1), 
				"Reunião", 90, 'N');
		dia.addCompromisso(c2);
		
		assertEquals(2, dia.getQtdCompromissos());
	}

	@Test
	void test02AddCompromissoInvalido() {
		DataAgenda dia = new DataAgenda();
		dia.setData(LocalDate.of(2022, 9, 19));
		
		Compromisso c1 = new Compromisso(LocalTime.of(12, 0), 
										"Almoço", 90, 'N');
		dia.addCompromisso(c1);
		
		Compromisso c2 = new Compromisso(LocalTime.of(12, 0), 
				"Reunião", 90, 'N');
		dia.addCompromisso(c2);
		
		assertEquals(1, dia.getQtdCompromissos());
	}
	
	@Test
	void test03GetTempoMedio() {
		DataAgenda dia = new DataAgenda();
		dia.setData(LocalDate.of(2022, 9, 19));
		
		Compromisso c1 = new Compromisso(LocalTime.of(12, 0), 
										"Almoço", 90, 'N');
		dia.addCompromisso(c1);
		
		Compromisso c2 = new Compromisso(LocalTime.of(13, 0), 
				"Reunião", 120, 'N');
		dia.addCompromisso(c2);
		
		Compromisso c3 = new Compromisso(LocalTime.of(18, 0), 
				"Academia", 60, 'N');
		dia.addCompromisso(c3);
		
		assertEquals(90, dia.getTempoMedio());
	}
	
	@Test
	void test04GetTempoMedioZero() {
		DataAgenda dia = new DataAgenda();
		dia.setData(LocalDate.of(2022, 9, 19));
		
		assertEquals(0, dia.getTempoMedio());
	}

	@Test
	void test05GetQtdCompromissosPrioridade() {
		// Arrange
		DataAgenda dia = new DataAgenda();
		dia.setData(LocalDate.of(2022, 9, 19));
		
		Compromisso c1 = new Compromisso(LocalTime.of(12, 0), 
										"Almoço", 90, 'N');
		dia.addCompromisso(c1);
		
		Compromisso c2 = new Compromisso(LocalTime.of(13, 0), 
				"Reunião", 120, 'A');
		dia.addCompromisso(c2);
		
		Compromisso c3 = new Compromisso(LocalTime.of(18, 0), 
				"Academia", 60, 'N');
		dia.addCompromisso(c3);
		
		// Act & Assert
		assertEquals(2, dia.getQtdCompromissosPrioridade('N'));
	}

}
