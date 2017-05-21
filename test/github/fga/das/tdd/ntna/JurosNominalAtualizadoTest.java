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
		jurosNominalAtualizado.setFatorJurosNominalAtualizado(3.2);
		jurosNominalAtualizado.setValorNominalAtualizado(3.0);
		assertEquals(533.33333, jurosNominalAtualizado.calcula(), ERRO);
	}

}
