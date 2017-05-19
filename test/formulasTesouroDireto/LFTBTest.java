package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.LFTA;

public class LFTBTest {
	
	private LTFB ltfb;

	@Before
	public void setUp() {
		lftb = new LFTB();
	}
	
	@Test
	public void testNotNUll() {
		assertNotNull(lftb);
	}

}
