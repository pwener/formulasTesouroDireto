package guthub.fga.das.tdd.LFT;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.LFT.LTN;

public class LTNTest {

	private LTN ltn;

	@Before
	public void setUp() {
		this.ltn = new LTN();
	}

	@Test
	public void testCalculaPrecoUnitario() {
		ltn.setTaxaIndicativa(0.01);
		assertEquals(999.960515, ltn.calculaPrecoUnitario(), 0.000001);
	}
}
