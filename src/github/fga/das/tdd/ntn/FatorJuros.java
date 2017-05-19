package github.fga.das.tdd.ntn;

public class FatorJuros {

	private int numeroMeses;
	private int taxaJuros;
	private int dcp;
	private int dct;

	public int getNumeroMeses() {
		return numeroMeses;
	}

	public void setNumeroMeses(int numeroMeses) {
		this.numeroMeses = numeroMeses;
	}

	public int getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(int taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public int getDcp() {
		return dcp;
	}

	public void setDcp(int dcp) {
		this.dcp = dcp;
	}

	public int getDct() {
		return dct;
	}

	public void setDct(int dct) {
		this.dct = dct;
	}

	public Double calcula() {
		return 0.0;
	}

}
