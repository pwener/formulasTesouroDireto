package github.fga.das.tdd.ntna;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValorNominalAtualizadoTest {
	
	private static final double ERRO = 0.00001;

	private ValorNominalAtualizado valorNominalAtualizado;
	
	@Before
	public void setUp() {
		this.valorNominalAtualizado = new JurosNominal();
	}
	
	@Test
	public void testCalcula(){
		valorNominalAtualizado.setDolarA(3.2);
		valorNominalAtualizado.setDolarB(3.0);
		valorNominalAtualizado.setValorEmissao(500.0);
		assertEquals(533.33333, valorNominalAtualizado.calcula(), ERRO);
	}

}
