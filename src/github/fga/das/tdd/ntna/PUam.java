package github.fga.das.tdd.ntna;

public class PUam {
	
	private Double dolarA;
	private Double dolarB;
	private Double valorEmissao;
	private Double percentualAmortizacao;
	
	public void setDolarA(Double dolarA) {
		this.dolarA = dolarA;
	}

	public void setDolarB(Double dolarB) {
		this.dolarB = dolarB;
	}

	public void setValorEmissao(Double valorEmissao) {
		this.valorEmissao = valorEmissao;
	}

	public void setPercentualAmortizacao(Double percentualAmortizacao) {
		this.percentualAmortizacao = percentualAmortizacao;
	}

	public double calcula() {
		
		return (this.dolarA/this.dolarB)*(this.valorEmissao*this.percentualAmortizacao);
	}

}
