package formulasTesouroDireto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.fga.das.tdd.BTN;
import github.fga.das.tdd.FatorJuros;

public class BTNTest {
	private static final double ERRO = 0.000001;
	
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
		assertEquals(10, btn.getPrecoUnitario(), ERRO);
	}
	
	@Test
	public void testSecondPrecoUnitario() {
		btn.setPrecoUnitarioAnterior(10.0);
		btn.setTaxaReferencial(2.0);
		btn.calculaPrecoUnitario();
		assertEquals(20, btn.getPrecoUnitario(), ERRO);
	}
	
	@Test
	public void testCalculaJuros() {
		btn.setFatorJuros(new FatorJuros(10.0, 12));
		btn.setPrecoUnitario(5.0);
		assertEquals(0.5, btn.getJuros(), ERRO);
	}

	
	@Test
	public void testPrincipal() {
		btn.setQte(100);
		
		assertEquals(100, btn.getQte);
		
		double principal = 0;
		principal = btn.getPrincipal();
		assertNotEquals(0, principal);
	}
}
