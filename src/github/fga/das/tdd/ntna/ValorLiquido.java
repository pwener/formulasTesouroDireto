package github.fga.das.tdd.ntna;

public class ValorLiquido {
	
	private Double valorEmissao;
	private Double percentualAmortizacao;
	
	public void setValorEmissao(Double valorEmissao) {
		this.valorEmissao = valorEmissao;
	}

	public void setPercentualAmortizacao(Double percentualAmortizacao) {
		this.percentualAmortizacao = percentualAmortizacao;
	}

	public double calcula() {
		return this.valorEmissao*this.percentualAmortizacao;
	}

}
