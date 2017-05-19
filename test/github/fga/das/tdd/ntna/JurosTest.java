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
		PUam puam = new PUam();
		puam.setDolarA(3.2);
		puam.setDolarB(3.0);
		puam.setValorLiquido(new ValorLiquido(20.0,0.9));
		juros.setPuam(puam);
		juros.setFatorJuros(0.2);
		assertEquals(3.84, juros.calcula(), ERRO);
	}

}
