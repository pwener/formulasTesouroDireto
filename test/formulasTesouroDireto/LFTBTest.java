package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.LTFB;

public class LFTBTest {
	
	private LTFB ltfb;
	private static final double PRECISION2 = 0.00;

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

}
