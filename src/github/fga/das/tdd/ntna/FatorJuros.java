package github.fga.das.tdd.ntna;

public class FatorJuros {
	
	public Double dtp;
	public Double dtup;
	public Double taxaJuros;

	public void setDtp(Double dtp) {
		this.dtp = dtp;
	}

	public void setDtup(Double dtup) {
		this.dtup = dtup;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public double calcula() {
		return ((this.dtp-this.dtup)/360)*(this.taxaJuros/100);
	}

}
