package github.fga.das.tdd.ntna;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JurosTest {
	
	private static final double ERRO = 0.00001;

	private Juros juros;
	
	@Before
	public void setUp() {
		this.juros = new Juros();
	}
	
	@Test
	public void testCalcula(){
		juros.setPUam(10);
		juros.setFatorJuros(3.0);
		assertEquals(30.0, juros.calcula(), ERRO);
	}

}
