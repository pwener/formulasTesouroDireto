package formulasTesouroDireto;

import org.junit.Assert;
import org.junit.Test;

public class VNATest {
	private VNA vna;
	
	@Test
	public void setUp() {
		this.vna = new VNA();
	}
	
	public void testCalcula(){
		vna.setFator(5);
		vna.setIPCA0(0.5);
		vna.setIPCA1(0.8);
		vna.setVN(2);
		Assert.assertEquals(16.0, vna.calcula(), 0.00001);
	}
}
