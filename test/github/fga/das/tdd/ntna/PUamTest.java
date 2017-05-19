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
		puam.setDolarA(3.2);
		puam.setDolarB(3.0);
		puam.setValorLiquido(new ValorLiquido(20.0,0.9));
		assertEquals(19.2, puam.calcula(), ERRO);
	}

}
