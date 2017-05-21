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
		jurosNominal.setFatorJurosNominal(new FatorJurosNominal(10.0,6));
		assertEquals(53.33333, jurosNominal.calcula(), ERRO);
	}
}
