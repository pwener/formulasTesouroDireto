package github.fga.das.tdd.ntn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.ntn.FatorRendimento;
import github.fga.das.tdd.ntn.Juros;
import github.fga.das.tdd.ntn.VNA;

public class JurosTest {
	private static final double ERRO = 0.000001;

	private Juros juro;

	@Before
	public void setUp() {
		this.juro = new Juros();
	}

	@Test
	public void calcula() {
		VNA vna = new VNA();
		vna.setFator(new FatorRendimento(25.0, 5.0, 1, 1));
		vna.setIPCA0(0.5);
		vna.setIPCA1(0.8);
		vna.setValorNominal(2.0);
		// calcula retorna 16
		juro.setVNA(vna);
		juro.setFatorJuros(1.2);
		assertEquals(3.199999, juro.calcula(), ERRO);
	}
}
