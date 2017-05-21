package github.fga.das.tdd.ntna;

public class ValorNominal {
	
	public Double dolarA;
	public Double dolarB;
	
	public void setDolarA(Double dolarA) {
		this.dolarA = dolarA;
		
	}
	
	public void setDolarB(Double dolarB) {
		this.dolarB = dolarB;
		
	}

	public double calcula() {
		return (this.dolarA/this.dolarB)*1000.0;
	}

}
