package github.fga.das.tdd.ntna;

public class JurosNominal {
	
	public ValorNominal valorNominal;
	public Double fatorJurosNominal;
	
	public void setValorNominal(ValorNominal valorNominal) {
		this.valorNominal = valorNominal;
	}

	public void setFatorJurosNominal(Double fatorJurosNominal) {
		this.fatorJurosNominal = fatorJurosNominal;
	}

	public double calcula() {
		return this.valorNominal.calcula()*this.fatorJurosNominal;
	}

}
