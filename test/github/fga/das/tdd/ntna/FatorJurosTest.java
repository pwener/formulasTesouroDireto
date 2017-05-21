package github.fga.das.tdd.ntna;

import static org.junit.Assert.*;

import org.junit.Test;

public class FatorJurosTest {
	
	private static final double ERRO = 0.00001;
	
	@Test
	public void testCalcula(){
		FatorJuros fatorJuros = new FatorJuros(210.0,200.0,10.0);
		assertEquals(0.00277777, fatorJuros.calcula(), ERRO);
	}

}
