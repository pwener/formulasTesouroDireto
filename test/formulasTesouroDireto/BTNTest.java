package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BTNTest {
	
	private BTN btn;
	
	@Before
	public void setUp() {
		this.btn = new BTNTest();
	}
	
	@Test
	public void testPrecoUnitario() {
		btn.setPrecoUnitarioAnterior(5);
		btn.setTaxaReferencial(2);
		assertEquals(10, btn.getPrecoUnitatio());
	}
}
