package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.LFT;

public class HandleDecimalTest {

	private HandleDecimal handle;
	
	@Before
	public void setUp() {
		this.handle = new HandleDecimal();
	}

	@Test
	public void testHandleDecimalNotNull() {
		assertNotNull(handle);
	}
}
