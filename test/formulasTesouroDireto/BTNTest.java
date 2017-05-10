package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.BTN;

public class BTNTest {
	
	private BTN btn;
	
	@Before
	public void setUp() {
		this.btn = new BTN();
	}
	
	@Test
	public void testPrecoUnitario() {
		btn.setPrecoUnitarioAnterior(5.0);
		btn.setTaxaReferencial(2.0);
		assertEquals(10, btn.getPrecoUnitatio(), 0.000006);
	}
	
	@Test
	public void testSecondPrecoUnitario() {
		btn.setPrecoUnitarioAnterior(10.0);
		btn.setTaxaReferencial(2.0);
		assertEquals(20, btn.getPrecoUnitatio(), 0.000006);
	}
}
