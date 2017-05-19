package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.LFTA;

public class LFTATest {

	private LFTA lfta;
	private static final double PRECISION4 = 0.0000;
	private static final double PRECISION2 = 0.00;
	private static final double PRECISION8 = 0.00000000;
	private static final double PRECISION6= 0.000000;
	
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
	
	@Test
	public void testDut() {
		lfta.setDut(10);
		
		assertEquals(10, lfta.getDut());
		assertNotEquals(5, lfta.getDut());
	}
	
	@Test
	public void testDu() {
		lfta.setDu(10);
		
		assertEquals(10, lfta.getDu());
		assertNotEquals(5, lfta.getDu());
	}
	
	@Test
	public void testTac() {
		assertEquals(0.0245, lfta.getTac(), PRECISION4);
	}
	
	@Test
	public void testSelicA() {
		lfta.setSelicA(1.45);
		assertEquals(1.45,lfta.getSelicA(), PRECISION2);
	}
	
	@Test
	public void testTSelicD() {
		lfta.setSelicA(1.45);
		assertEquals(0.00005713,lfta.getTSelicD(), PRECISION8);
	}
	
	@Test
	public void testC() {
		lfta.setSelicA(1.45);
		assertEquals(1.00017140, lfta.getC(3), PRECISION8);
	}
	
	@Test
	public void testVE() {
		lfta.setVE(10.12345678);
		
		assertEquals(10.123456, lfta.getVE(), PRECISION6);
		assertNotEquals(10.12345678, lfta.getVE(), PRECISION6);
	}
}



