package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LFTTest {
	
	private LFT lft;

	@Before
	public void setUp() {
		this.lft = new LFT();
	}
	
	@Test
	public void testLFTNotNull() {
		assertNotNull(lft);
	}

}
