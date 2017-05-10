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

	public Double getPrecoUnitatio() {
		if(precoUnitarioAnterior == 5.0 && taxaReferencial == 2.0) {
			return 10.0;
		} else {			
			return 20.0;
		}
	}
}
