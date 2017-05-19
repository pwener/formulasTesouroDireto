package github.fga.das.tdd;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LFT {
	
	private double VNb;
	private double C;
	private double selic;
	
	public LFT() {
		
	}
	
	public void setVBn(double number) {
		if (number < 0) {
			this.VNb = 0.000000;
		} else {
			this.VNb = HandleDecimal.truncate(number, 6);
		}
	}
	
	public double getVNb() {
		return this.VNb;
	}
	
	public void setC(double number) {
		this.VNb = HandleDecimal.round(number, 8);
	}
	
	public double getC() {
		return this.VNb;
	}
	
	public void setSelic(double number) {
		this.selic = HandleDecimal.truncate(number, 2);
	}
	
	public double getSelic() {
		return this.selic;
	}
	
	public double getTSelic() {
		return HandleDecimal.round(Math.pow((this.getSelic()/100.0 + 1.0), (1.0/252.0)) - 1.0, 8);
	}
}
