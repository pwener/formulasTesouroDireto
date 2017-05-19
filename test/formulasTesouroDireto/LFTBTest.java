package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.LTFB;

public class LFTBTest {
	
	private LTFB ltfb;
	private static final double PRECISION2 = 0.00;
	private static final double PRECISION8 = 0.00000000;

	@Before
	public void setUp() {
		ltfb = new LTFB();
	}
	
	@Test
	public void testNotNUll() {
		assertNotNull(ltfb);
	}
	
	@Test
	public void testSelicK() {
		ltfb.addSelicK(3.435);
		ltfb.addSelicK(4.567);
		ltfb.addSelicK(4.234);
		
		assertEquals(3, ltfb.getSelicK().size());
		assertEquals(3.43, ltfb.getSelicK(1), PRECISION2);
	}
	
	@Test
	public void testTSelicK() {
		ltfb.addSelicK(3.43);
		ltfb.addSelicK(4.43);
		ltfb.addSelicK(5.43);
		
		assertEquals(0.00013384, ltfb.getTSelicK(1),PRECISION8);
		assertEquals(0.00017203, ltfb.getTSelicK(2),PRECISION8);
		assertEquals(0.00020985, ltfb.getTSelicK(3),PRECISION8);
	}
	
	@Test
	public void testGetC() {
		ltfb.addSelicK(3.43);
		ltfb.addSelicK(4.43);
		
		assertEquals(1.00030589, ltfb.getC(2), PRECISION8);
	}

}
