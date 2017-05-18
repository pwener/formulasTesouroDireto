package github.fga.das.tdd;

public class BTN {

	private Double precoUnitarioAnterior;
	private Double taxaReferencial;
	private double precoUnitario;
	private FatorJuros fatorJuros;

	public void setPrecoUnitarioAnterior(Double preco) {
		this.precoUnitarioAnterior = preco;
	}

	public void setTaxaReferencial(Double taxa) {
		this.taxaReferencial = taxa;
	}

	public Double getPrecoUnitarioAnterior() {
		return precoUnitarioAnterior;
	}

	public Double getTaxaReferencial() {
		return taxaReferencial;
	}

	public void calculaPrecoUnitario() {
		setPrecoUnitario(getPrecoUnitarioAnterior() * getTaxaReferencial());
	}

	public Double getPrecoUnitario() {
		return this.precoUnitario;
	}

	public void setPrecoUnitario(double preco) {
		this.precoUnitario = preco;
	}

	public void setFatorJuros(FatorJuros fatorJuros) {
		this.fatorJuros = fatorJuros;
	}
	
	public Double getFatorJuros() {
		return this.fatorJuros.calculaFatorJuros();
	}

	public double getJuros() {
		return getPrecoUnitario() * getFatorJuros();
	}
	
	public double getPrincipal() {
		return 1.0;
	}

}
