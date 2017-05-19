package formulasTesouroDireto;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import github.fga.das.tdd.FatorJuros;

@RunWith(Parameterized.class)
public class FatorJurosTest {
	
	private static final double ERRO = 0.0000001;
	
	private FatorJuros fatorJuros;
	
	private Double taxaJuros; 
	private Integer numeroMeses;
	private Double expected;
	
	public FatorJurosTest(Double taxaJuros, Integer numeroMeses, Double expected) {
		this.taxaJuros = taxaJuros;
		this.numeroMeses = numeroMeses;
		this.expected = expected;
	}
	
	@Parameters
	public static Iterable valoresFatorJuros() {
		return Arrays.asList(
				new Object[][]{
					{10.0, 12, 0.1},
					{20.0, 6, 0.09544511},
					{15.0, 4, 0.04768955}
				}
		);
	}
	
	@Test
	public void testCalculaFatorJuros() {
		this.fatorJuros = new FatorJuros(taxaJuros, numeroMeses);
		assertEquals(expected, fatorJuros.calculaFatorJuros(), ERRO);
	}
	
}
