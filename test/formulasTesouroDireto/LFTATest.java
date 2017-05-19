package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.LFTA;

public class LFTATest {

	private LFTA lfta;
	
	@Before
	public void setUp() {
		lfta = new LFTA();
	}
	
	@Test
	public void testNotNUll() {
		assertNotNull(lfta);
	}
	
	@Test
	public void testN() {
		lfta.setN(10);
		
		assertEquals(10, lfta.getN());
		assertNotEquals(11, lfta.getN());
	}
	
	@Test
	public void testP() {
		lfta.setP(10);

		assertEquals(10, lfta.getP());
		assertNotEquals(5, lfta.getP());
	}
}
