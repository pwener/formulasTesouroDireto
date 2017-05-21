package github.fga.das.tdd.ntna;

public class JurosNominal {
	
	public Double valorNominal;
	public Double fatorJurosNominal;
	
	public void setValorNominal(Double valorNominal) {
		this.valorNominal = valorNominal;
	}

	public void setFatorJurosNominal(Double fatorJurosNominal) {
		this.fatorJurosNominal = fatorJurosNominal;
	}

	public double calcula() {
		return 0.2;
	}

}
