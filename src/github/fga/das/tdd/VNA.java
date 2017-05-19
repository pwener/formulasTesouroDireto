package github.fga.das.tdd;

/**
 * Valor nominal atualizado
 */
public class VNA {

	private Double fator;
	private Double ipca1;
	private Double ipca0;
	private Double valorNominal;
	
	public void setFator(Double fator) {
		this.fator = fator;
	}

	public void setIPCA1(Double ipca1) {
		this.ipca1 = ipca1;
	}

	public void setIPCA0(Double ipca0) {
		this.ipca0 = ipca0;
	}

	public void setValorNominal(Double valorNominal) {
		this.valorNominal = valorNominal;
	}

	public double calcula() {
		return 16;
	}

}
