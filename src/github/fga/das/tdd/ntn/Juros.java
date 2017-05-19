package github.fga.das.tdd.ntn;

public class Juros {

	private VNA vna;
	private FatorJuros fator;
	
	public void setVNA(VNA vna) {
		this.vna = vna;
	}

	public void setFatorJuros(FatorJuros fator) {
		this.fator = fator;
	}

	public Double calcula() {
		return vna.calcula() * (fator.calcula() - 1);
	}

}
