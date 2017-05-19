package github.fga.das.tdd.ntn;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import github.fga.das.tdd.ntn.FatorRendimento;

@RunWith(Parameterized.class)
public class FatorRendimentoTest {

	private static final double ERRO = 0.000001;

	private FatorRendimento fator;

	private Double ipca1;
	private Double ipca0;
	private Integer diasCorridos;
	private Integer diasCorridosEmQuinzena;
	private Double result;

	public FatorRendimentoTest(Double ipca1, Double ipca0,
			int diasCorridos, int diasCorridosEmQuinzena,
			Double result) {
		this.ipca0 = ipca0;
		this.ipca1 = ipca1;
		this.diasCorridos = diasCorridos;
		this.diasCorridosEmQuinzena = diasCorridosEmQuinzena;
		this.result = result;
	}
	
	@Parameters
	public static Iterable valoresFatorJuros() {
		return Arrays.asList(
				new Object[][] {
					{0.8, 0.5, 20, 5, 6.55360},
					{2.0, 5.0, 20, 2, 0.000104857},
					{10.0, 25.0, 20, 10, 0.160000000}
				}
			);
	}

	@Before
	public void setUp() {
		this.fator = new FatorRendimento();
	}

	@Test
	public void testCalcula() {
		fator.setIPCA1(ipca1);
		fator.setIPCA0(ipca0);
		fator.setDiasCorridos(diasCorridos);
		fator.setDiasCorridosEmQuinzena(diasCorridosEmQuinzena);
		assertEquals(result, fator.calcula(), ERRO);
	}
}
