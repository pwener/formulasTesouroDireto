package github.fga.das.tdd;

import java.util.ArrayList;
import java.util.List;

public class LTFB {
	
	private List<Double> selicK;
	private double vnb;
	
	public double getVnb() {
		return vnb;
	}

	public void setVnb(double vnb) {
		this.vnb = HandleDecimal.truncate(vnb, 6);
	}

	public LTFB() {
		selicK = new ArrayList<>();
	}
	
	public void addSelicK(double number) {
		selicK.add(HandleDecimal.truncate(number, 2));
	}
	
	public List<Double> getSelicK() {
		return selicK;
	}
	
	public double getSelicK(int i) {
		return selicK.get(i-1);
	}
	
	public double getTSelicK(int i) {
		double tSelicK = Math.pow((this.getSelicK(i)/100 + 1),(1.0/252.0)) - 1;
		return HandleDecimal.round(tSelicK, 8);
	}
	
	public double getC(int n) {
		double C =1;
		for(int i =0; i< n; i++) {
			C *= (1 + this.getTSelicK(i+1));
		}
		
		return HandleDecimal.round(C, 8);
	}
	
	public double getVna(int n) {
		return HandleDecimal.truncate(this.getC(n)*this.getVnb(), 6);
	}
	
	
}
