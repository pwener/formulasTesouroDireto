package github.fga.das.tdd;

public class BTN {

	private Double precoUnitarioAnterior;
	private Double taxaReferencial;
	private Double fatorJuros;
	private double precoUnitario;
	private FatorJuros _fatorJuros = new FatorJuros(10.0, 12);

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

	public void setFatorJuros(Double juros) {
		this.fatorJuros = juros;
	}

	public Double getFatorJuros() {
		return this._fatorJuros.calculaFatorJuros();
	}

	public double getJuros() {
		return getPrecoUnitario() * getFatorJuros();
	}

}
