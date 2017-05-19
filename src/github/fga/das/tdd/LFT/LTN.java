package github.fga.das.tdd.LFT;
import github.fga.das.tdd.HandleDecimal;

public class LTN {

	private Double taxaIndicativa;

	public void setTaxaIndicativa(Double taxa) {
		this.taxaIndicativa = taxa;
	}

	public Double calculaPrecoUnitario() {
		Double exponent = 1.0 / 252.0;

		Double quotient = Math.pow((1+taxaIndicativa), exponent);

		return HandleDecimal.round(1000.0 / quotient, 6);
	}
}
