package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.LFT;

public class LFTATest {

	private LFTA lfta;
	
	@Before
	public void setUp() {
		lfta = new LFTA();
	}
	
	@Test
	public void test() {
		assertNotNull(lfta);
	}
}
