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
}
