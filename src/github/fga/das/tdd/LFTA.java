package github.fga.das.tdd;

public class LFTA {
	private int N;
	private int P;
	private int Du;
	private int Dut;
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
}
