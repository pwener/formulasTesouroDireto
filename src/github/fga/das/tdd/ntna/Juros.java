package github.fga.das.tdd.ntna;

public class Juros {
	
	private PUam puam;
	private Double fatorJuros;
	
	
	public void setPuam(PUam puam) {
		this.puam = puam;
	}

	public void setFatorJuros(Double fatorJuros) {
		this.fatorJuros = fatorJuros;
	}

	public double calcula() {
		
		return this.puam.calcula()*this.fatorJuros;
	}

}
