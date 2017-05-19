package github.fga.das.tdd;

import java.util.ArrayList;
import java.util.List;

public class LTFB {
	
	private List<Double> selicK;
	
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
}
