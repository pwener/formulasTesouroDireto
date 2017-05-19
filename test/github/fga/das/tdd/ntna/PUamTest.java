package github.fga.das.tdd.ntna;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PUamTest {
	
	private static final double ERRO = 0.00001;

	private PUam puam;
	private ValorLiquido valorLiquido;
	
	@Before
	public void setUp() {
		this.puam = new PUam();
		this.valorLiquido = new ValorLiquido();
	}
	
	@Test
	public void testCalcula(){
		puam.setDolarA(3.2);
		puam.setDolarB(3.0);
		valorLiquido.setValorEmissao(20.0);
		valorLiquido.setPercentualAmortizacao(0.9);
		puam.setValorLiquido(valorLiquido);
		assertEquals(19.2, puam.calcula(), ERRO);
	}

}
