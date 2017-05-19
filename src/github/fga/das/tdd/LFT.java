package github.fga.das.tdd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class LFT {
	
	private double VNb;
	private double C;
	private List<Double> selicK;
	
	public LFT() {
		selicK = new ArrayList<>();
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
	
	public List<Double> getSelick() {
		return this.selicK;
	}
	
	public double getSelicK(int i) {
		return this.selicK.get(i-1);
	}
	
	public void addSelicK(double selic) {
		this.selicK.add(HandleDecimal.truncate(selic, 2));
	}

	public double getTSelic() {
		return HandleDecimal.round(Math.pow((this.getSelic()/100.0 + 1.0), (1.0/252.0)) - 1.0, 8);
	}
}
