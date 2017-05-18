package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.LFT;

public class LFTTest {
	
	private LFT lft;
	private static final double PRECISION6 = 0.000000;
	private static final double PRECISION8 = 0.00000000;
	private static final double PRECISION2 = 0.00;

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
	
	@Test
	public void testVNbNotNegative() {
		lft.setVBn(-34);
		assertEquals(PRECISION6, lft.getVNb(), PRECISION6);
	}

	@Test
	public void testCRounded() {
		lft.setC(10.987654321);
		assertEquals(10.98765432, lft.getC(), PRECISION8);
		
		lft.setC(10.987654327);
		assertEquals(10.98765433, lft.getC(), PRECISION8);
		
		lft.setC(10.987654327);
		assertNotEquals(10.98765432, lft.getC(), PRECISION8);
	}
	
	@Test
	public void testSelic() {
		lft.setSelic(3.54321);
		assertEquals(3.54, lft.getSelic(), PRECISION2);
	}
}
