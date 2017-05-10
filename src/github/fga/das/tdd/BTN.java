package github.fga.das.tdd;

public class BTN {

	private Double precoUnitarioAnterior;
	private Double taxaReferencial;

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

	public Double getPrecoUnitatio() {
		return getPrecoUnitarioAnterior() * getPrecoUnitatio();
	}
}
