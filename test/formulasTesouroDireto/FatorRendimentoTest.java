package formulasTesouroDireto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.FatorRendimento;

public class FatorRendimentoTest {

	private static final double ERRO = 0.000001;

	private FatorRendimento fator;

	@Before
	public void setUp() {
		this.fator = new FatorRendimento();
	}

	@Test
	public void testCalcula() {
		fator.setIPCA1(0.8);
		fator.setIPCA0(0.5);
		fator.setDiasCorridos(20);
		fator.setDiasCorridosEmQuinzena(5);
		assertEquals(6.55360, fator.calcula(), ERRO);
	}
}