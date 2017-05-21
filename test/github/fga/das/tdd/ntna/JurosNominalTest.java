package github.fga.das.tdd.ntna;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JurosNominalTest {

	private static final double ERRO = 0.00001;

	private JurosNominal jurosNominal;
	
	@Before
	public void setUp() {
		this.jurosNominal = new JurosNominal();
	}
	
	@Test
	public void testCalcula(){
		ValorNominal valorNominal = new ValorNominal();
		valorNominal.setDolarA(3.2);
		valorNominal.setDolarB(3.0);
		jurosNominal.setValorNominal(valorNominal);
		jurosNominal.setFatorJurosNominal(0.1);
		assertEquals(106.66666, jurosNominal.calcula(), ERRO);
	}
}
