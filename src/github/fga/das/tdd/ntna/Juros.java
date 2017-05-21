package github.fga.das.tdd.ntna;

public class Juros {
	
	private PUam puam;
	private FatorJuros fatorJuros;
	
	public void setPuam(PUam puam) {
		this.puam = puam;
	}

	public void setFatorJuros(FatorJuros fatorJuros) {
		this.fatorJuros = fatorJuros;
	}

	public double calcula() {
		
		return this.puam.calcula()*this.fatorJuros.calcula();
	}

}
