package github.fga.das.tdd;

public class LFTA {
	private int N;
	private int P;
	private int Du;
	private int Dut;
	private double selicA;
	private static final double tac = 0.0245; 
	
	public void setN(int N) {
		this.N = N;
	}
	
	public int getN() {
		return this.N;
	}
	
	public void setP(int P) {
		this.P = P;
	}
	
	public int getP() {
		return this.P;
	}

	public int getDu() {
		return Du;
	}

	public void setDu(int du) {
		Du = du;
	}

	public int getDut() {
		return Dut;
	}

	public void setDut(int dut) {
		Dut = dut;
	}	
	
	public double getTac() {
		return this.tac;
	}
	
	public void setSelicA(double n) {
		this.selicA = HandleDecimal.truncate(n, 2);
	}
	
	public double getSelicA() {
		return this.selicA;
	}
	
	public double getTSelicD() {
		double tselic = Math.pow((1.0 + this.getSelicA()/100.0), (1.0/252.0)) - 1;
		return HandleDecimal.round(tselic,8);
	}
	
	public double getC(int n) {
		double c = 1;
		for(int i =0; i< n; i++) {
			c *= (1 + this.getTSelicD());
		}
		
		return HandleDecimal.round(c, 8);
	}
	
	
}
