package github.fga.das.tdd.ntna;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JurosNominalAtualizadoTest {
	
	private static final double ERRO = 0.00001;

	private JurosNominalAtualizado jurosNominalAtualizado;
	
	@Before
	public void setUp() {
		this.jurosNominalAtualizado = new JurosNominalAtualizado();
	}
	
	@Test
	public void testCalcula(){
		ValorNominalAtualizado valorNominalAtualizado = new ValorNominalAtualizado();
		valorNominalAtualizado.setDolarA(3.2);
		valorNominalAtualizado.setDolarB(3.0);
		valorNominalAtualizado.setValorEmissao(500.0);
		jurosNominalAtualizado.setValorNominalAtualizado(valorNominalAtualizado);
		jurosNominalAtualizado.setFatorJurosNominalAtualizado(3.2);
		assertEquals(1706.66666, jurosNominalAtualizado.calcula(), ERRO);
	}

}
