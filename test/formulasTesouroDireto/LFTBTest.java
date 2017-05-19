package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.LTFB;

public class LFTBTest {
	
	private LTFB ltfb;

	@Before
	public void setUp() {
		ltfb = new LTFB();
	}
	
	@Test
	public void testNotNUll() {
		assertNotNull(ltfb);
	}

}
