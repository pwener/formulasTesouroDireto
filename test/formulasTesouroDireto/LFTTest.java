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
	public void testC() {
		lft.addSelicK(3.54);
		assertEquals(1.00013806, lft.getC(1), PRECISION8);		
	}
	
	@Test
	public void testSelicKNotNull() {
		assertNotNull(lft.getSelick());
	}
	
	@Test
	public void testSelic() {
		lft.addSelicK(3.54321);
		lft.addSelicK(4.54321);
		lft.addSelicK(5.54321);
		assertEquals(3.54, lft.getSelicK(1), PRECISION2);
		assertEquals(4.54, lft.getSelicK(2), PRECISION2);
		assertEquals(5.54, lft.getSelicK(3), PRECISION2);
	}
	
	@Test
	public void testTSelic() {
		lft.addSelicK(11.0);
		assertEquals(0.00041421, lft.getTSelic(1), PRECISION8);
		assertNotEquals(0.00041422, lft.getTSelic(1), PRECISION8);
	}
}
