package github.fga.das.tdd.ntna;

import static org.junit.Assert.*;

import org.junit.Test;

public class FatorJurosNominalTest {
	
	private static final double ERRO = 0.00001;
	
	@Test
	public void testCalcula(){
		FatorJurosNominal fatorjurosNominal = new FatorJurosNominal(10.0,6);
		assertEquals(0.05, fatorjurosNominal.calcula(), ERRO);
	}

}
