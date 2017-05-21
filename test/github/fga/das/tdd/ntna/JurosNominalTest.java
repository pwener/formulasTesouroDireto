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
		jurosNominal.setValorNominal(2.0);
		jurosNominal.setFatorJurosNominal(0.1);
		assertEquals(0.2, jurosNominal.calcula(), ERRO);
	}
}
