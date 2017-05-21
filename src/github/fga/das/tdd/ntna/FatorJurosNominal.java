package github.fga.das.tdd.ntna;

public class FatorJurosNominal {
	
	public Double taxaJuros;
	public Integer numeroMeses;
	
	public FatorJurosNominal(Double taxaJuros, Integer numeroMeses) {
		this.setTaxaJuros(taxaJuros);
		this.setNumeroMeses(numeroMeses);
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void setNumeroMeses(Integer numeroMeses) {
		this.numeroMeses = numeroMeses;
	}

	public double calcula() {
		return (this.taxaJuros/100.0)*(this.numeroMeses/12.0);
	}

}
