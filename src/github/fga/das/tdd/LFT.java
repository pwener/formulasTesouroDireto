package github.fga.das.tdd;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LFT {
	
	private double VNb;
	
	public LFT() {
		
	}
	
	public void setVBn(double number) {
		if (number < 0) {
			this.VNb = 0.000000;
		} else {
			this.VNb = BigDecimal.valueOf(number).setScale(6, RoundingMode.FLOOR).doubleValue();
		}
	}
	
	public double getVNb() {
		return this.VNb;
	}

}
