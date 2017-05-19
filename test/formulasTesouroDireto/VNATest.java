package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.VNA;

public class VNATest {
	private static final double ERRO = 0.00001;

	private VNA vna;
	
	@Before
	public void setUp() {
		this.vna = new VNA();
	}
	
	@Test
	public void testCalcula(){
		vna.setFator(5.0);
		vna.setIPCA0(0.5);
		vna.setIPCA1(0.8);
		vna.setValorNominal(2.0);
		assertEquals(16.0, vna.calcula(), ERRO);
	}
}
