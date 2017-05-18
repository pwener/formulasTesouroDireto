package github.fga.das.tdd;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LFT {
	
	private double VNb;
	
	public LFT() {
		
	}
	
	public void setVBn(double number) {
		this.VNb = BigDecimal.valueOf(number).setScale(6, RoundingMode.FLOOR).doubleValue();
	}
	
	public double getVNb() {
		return this.VNb;
	}

}
