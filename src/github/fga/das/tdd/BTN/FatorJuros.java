package github.fga.das.tdd.BTN;

public class FatorJuros {

	private static final Double QUANTIDADE_MESES = 12.0;
	private Double taxaJuros;
	private Integer numeroMeses;

	public FatorJuros(Double taxaJuros, Integer numeroMeses) {
		this.taxaJuros = taxaJuros;
		this.numeroMeses = numeroMeses;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public Integer getNumeroMeses() {
		return numeroMeses;
	}

	public Double calculaFatorJuros() {
		Double expoente = getNumeroMeses() / QUANTIDADE_MESES;
		Double base = (1 + (getTaxaJuros() / 100));
		Double calculoExponencial = Math.pow(base, expoente);

		Double fatorJuros = calculoExponencial - 1;

		return fatorJuros;
	}
}
