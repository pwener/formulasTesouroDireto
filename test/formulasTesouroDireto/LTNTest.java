package formulasTesouroDireto;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.BTN;

public class LTNTest {

	LTN ltn;
	
	@Before
	public void setUp() {
		this.ltn = new LTN();
	}
	
	@Test
	public void testCalculaPrecoUnitario() {
		ltn.setTaxaIndicativa();
		assertEquals(997.253195, ltn.calculaPrecoUnitario(), 0.000001);
	}
}
