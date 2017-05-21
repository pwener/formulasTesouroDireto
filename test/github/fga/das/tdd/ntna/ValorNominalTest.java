package github.fga.das.tdd.ntna;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValorNominalTest {
	
	private static final double ERRO = 0.00001;

	private ValorNominal valorNominal;
	
	@Before
	public void setUp() {
		this.valorNominal = new ValorNominal();
	}
	
	@Test
	public void testCalcula(){
		valorNominal.setDolarA(3.2);
		valorNominal.setDolarB(3.0);
		assertEquals(1066.666, valorNominal.calcula(), ERRO);
	}

}
