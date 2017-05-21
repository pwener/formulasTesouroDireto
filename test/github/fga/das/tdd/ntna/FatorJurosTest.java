package github.fga.das.tdd.ntna;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FatorJurosTest {
	
	private static final double ERRO = 0.00001;

	private FatorJuros fatorJuros;
	
	@Before
	public void setUp() {
		this.fatorJuros = new FatorJuros();
	}
	
	@Test
	public void testCalcula(){
		fatorJuros.setDtp(210.0);
		fatorJuros.setDtup(200.0);
		fatorJuros.setTaxaJuros(10);
		assertEquals(0,002777777, fatorJuros.calcula(), ERRO);
	}

}
