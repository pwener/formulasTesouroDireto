package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.HandleDecimal;

public class HandleDecimalTest {

	private HandleDecimal handle;
	private static final double PRECISION6 = 0.000000;
	private static final double PRECISION8 = 0.00000000;
	private static final double PRECISION2 = 0.00; 
	
	@Before
	public void setUp() {
		this.handle = new HandleDecimal();
	}

	@Test
	public void testHandleDecimalNotNull() {
		assertNotNull(handle);
	}
	
	@Test
	public void testTruncateNumber() {
		assertEquals(3.45,HandleDecimal.truncate(3.4567,2), PRECISION2);
		assertNotEquals(3.4,HandleDecimal.truncate(3.4567,2), PRECISION2);
		assertNotEquals(3.456,HandleDecimal.truncate(3.4567,2), PRECISION2);
		assertNotEquals(3.46,HandleDecimal.truncate(3.4567,2), PRECISION2);
	}
}
