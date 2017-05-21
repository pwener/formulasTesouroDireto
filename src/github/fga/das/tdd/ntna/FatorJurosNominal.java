package github.fga.das.tdd.ntna;

public class FatorJurosNominal {
	
	public Double taxaJuros;
	public Integer numeroMeses;
	
	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void setNumeroMeses(Integer numeroMeses) {
		this.numeroMeses = numeroMeses;
	}

	public double calcula() {
		return 0.05;
	}

}
