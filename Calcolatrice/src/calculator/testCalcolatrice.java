package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testCalcolatrice {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSomma() {
		Calcolatrice calc=new Calcolatrice();
		int a=5;
		int b=4;
		int risultato=calc.somma(a, b);
		
		//asserisci se è uguale
		assertEquals(9,risultato, "Somma"); 
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testDividisione() {
		Calcolatrice calc=new Calcolatrice();
		int a=5;
		int b=4;
		double risultato=calc.dividi(a, b);
		
		//asserisci se è uguale
		assertEquals(1.,risultato,"Divisione");
		
		
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testDividisione2() {
		Calcolatrice calc=new Calcolatrice();
		int a=5;
		int b=0;
		double risultato=calc.dividi(a, b);
		System.out.println(risultato);
		assertEquals(Double.MAX_VALUE,risultato,"Divisione2");
		
		
		
		//fail("Not yet implemented");
	}

	
}
