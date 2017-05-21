package github.fga.das.tdd.ntna;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FatorJurosNominalTest {
	
	private static final double ERRO = 0.00001;

	private FatorJurosNominal fatorjurosNominal;
	
	@Before
	public void setUp() {
		this.fatorjurosNominal = new FatorJurosNominal();
	}
	
	@Test
	public void testCalcula(){
		fatorjurosNominal.setTaxaJuros(10.0);
		fatorjurosNominal.setNumeroMeses(6);
		assertEquals(0.05, fatorjurosNominal.calcula(), ERRO);
	}

}
