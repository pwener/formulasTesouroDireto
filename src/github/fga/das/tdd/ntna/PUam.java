package github.fga.das.tdd.ntna;

public class PUam {
	
	private Double dolarA;
	private Double dolarB;
	private ValorLiquido valorLiquido;

	public void setDolarA(Double dolarA) {
		this.dolarA = dolarA;
	}

	public void setDolarB(Double dolarB) {
		this.dolarB = dolarB;
	}
	
	public void setValorLiquido(ValorLiquido valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public double calcula() {
		
		return (this.dolarA/this.dolarB)*(this.valorLiquido.calcula());
	}

}
