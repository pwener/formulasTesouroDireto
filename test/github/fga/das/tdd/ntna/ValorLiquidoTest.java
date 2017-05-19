package github.fga.das.tdd.ntna;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValorLiquidoTest {
	
	private static final double ERRO = 0.00001;

	private ValorLiquido valorLiquido;
	
	@Before
	public void setUp() {
		this.valorLiquido = new ValorLiquido();
	}
	
	@Test
	public void testCalcula(){
		valorLiquido.setValorEmissao(20.0);
		valorLiquido.setPercentualAmortizacao(0.9);
		assertEquals(18.0, valorLiquido.calcula(), ERRO);
	}

}
