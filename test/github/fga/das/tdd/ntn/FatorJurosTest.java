package github.fga.das.tdd.ntn;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FatorJurosTest {

	private static final double ERRO = 0.000001;

	private FatorJuros juros;

	@Before
	public void setUp() {
		this.juros = new FatorJuros();
	}

	@Test
	public void calcula() {
		juros.setNumeroMeses(6);
		juros.setTaxaJuros(25);
		juros.setDcp(10);
		juros.setDct(5);
		assertEquals(1.25, juros.calcula(), ERRO);
	}
}
