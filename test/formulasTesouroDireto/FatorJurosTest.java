package formulasTesouroDireto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import github.fga.das.tdd.FatorJuros;

public class FatorJurosTest {
	
	private static final double ERRO = 0.000001;

	private FatorJuros fatorJuros;
	
	@Test
	public void testCalculaFatorJuros() {
		this.fatorJuros = new FatorJuros(10.0, 12);
		assertEquals(0.1, fatorJuros.calculaFatorJuros(), ERRO);
	}
}
