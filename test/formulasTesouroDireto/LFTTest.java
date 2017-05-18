package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.LFT;

public class LFTTest {
	
	private LFT lft;
	private static final double PRECISION6 = 0.000000;

	@Before
	public void setUp() {
		this.lft = new LFT();
	}
	
	@Test
	public void testLFTNotNull() {
		assertNotNull(lft);
	}
	
	@Test
	public void testeVNbPrecision() {
	 	lft.setVBn(70.987654321);
	 	
	 	assertEquals(lft.getVNb(), 70.987654, PRECISION6);
	 }

}
