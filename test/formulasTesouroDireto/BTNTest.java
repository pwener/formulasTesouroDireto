package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.BTN;
import github.fga.das.tdd.FatorJuros;

public class BTNTest {
	private static final double PRECISION6 = 0.000001;
	private static final double PRECISION2 = 0.00;
	
	private BTN btn;
		
	@Before
	public void setUp() {
		this.btn = new BTN();
	}
	
	@Test
	public void testPrecoUnitario() {
		btn.setPrecoUnitarioAnterior(5.0);
		btn.setTaxaReferencial(2.0);
		btn.calculaPrecoUnitario();
		assertEquals(10, btn.getPrecoUnitario(), PRECISION6);
	}
	
	@Test
	public void testSecondPrecoUnitario() {
		btn.setPrecoUnitarioAnterior(10.0);
		btn.setTaxaReferencial(2.0);
		btn.calculaPrecoUnitario();
		assertEquals(20, btn.getPrecoUnitario(), PRECISION6);
	}
	
	@Test
	public void testCalculaJuros() {
		btn.setFatorJuros(new FatorJuros(10.0, 12));
		btn.setPrecoUnitario(5.0);
		assertEquals(0.5, btn.getJuros(), PRECISION6);
	}

	
	@Test
	public void testPrincipal() {
		btn.setQte(100);
		assertEquals(100, btn.getQte());
		
		btn.setPrecoUnitario(3.123456);
		
		double principal = btn.getPrincipal();
		assertEquals(312.35, principal, PRECISION2);
	}
	
	//Test if round was made right. To 2 decimal places
	@Test
	public void testPrincipalRounded() {
		btn.setQte(100);
		btn.setPrecoUnitario(3.123456);
		
		// check to see if number was truncate
		assertNotEquals(312.34, btn.getPrincipal(), PRECISION2);
		
		// check to see if number was rounded up. witch is the right
		assertEquals(312.35, btn.getPrincipal(), PRECISION2);
		
		//check to see if number was rounded down. with is wrong
		assertNotEquals(312.34, btn.getPrincipal(), PRECISION2);		
	}
}
