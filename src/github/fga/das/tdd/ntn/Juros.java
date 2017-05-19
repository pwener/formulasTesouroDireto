package github.fga.das.tdd.ntn;

public class Juros {

	private VNA vna;
	private Double fator;
	
	public void setVNA(VNA vna) {
		this.vna = vna;
	}

	public void setFatorJuros(Double fator) {
		this.fator = fator;
	}

	public Double calcula() {
		return vna.calcula() * (fator - 1);
	}

}
