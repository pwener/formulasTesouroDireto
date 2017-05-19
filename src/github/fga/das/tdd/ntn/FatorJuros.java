package github.fga.das.tdd.ntn;

public class FatorJuros {
	private static final Double QUANTIDADE_MESES = 12.0;

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
		Double fatorInterno = (double)(getTaxaJuros()/100.0) + 1.0;
		Double primeiraPotencia = Math.pow(fatorInterno, (double)getNumeroMeses()/QUANTIDADE_MESES);
		Double resultadoFinal = Math.pow(primeiraPotencia, (double)getDcp()/getDct());
		return resultadoFinal;
	}

}
