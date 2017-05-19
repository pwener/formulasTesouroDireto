package github.fga.das.tdd.ntna;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PUamTest {
	
	private static final double ERRO = 0.00001;

	private PUam puam;
	
	@Before
	public void setUp() {
		this.puam = new PUam();
	}
	
	@Test
	public void testCalcula(){
		puam.setValorDolarA(3.2);
		puam.setValorDolarB(3.0);
		puam.setValorLiquido(45.00);
		assertEquals(45.00, puam.calcula(), ERRO);
	}

}
