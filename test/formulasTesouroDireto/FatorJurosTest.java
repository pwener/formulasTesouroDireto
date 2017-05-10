package formulasTesouroDireto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.BTN;

public class FatorJurosTest {
	
	private static final double ERRO = 0.000001;

	private FatorJuros fatorJuros;
	
	@Before
	public void setUp() {
		this.fatorJuros = new FatorJuros();
	}
	
	@Test
	public void testCalculaFatorJuros() {
		fatorJuros.setTaxaJuros(12.0);
		fatorJuros.setNumeroMeses(6);
		assertEquals(0.1, fatorJuros.calculaFatorJuros(), ERRO);
	}
}
