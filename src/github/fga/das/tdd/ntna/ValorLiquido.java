package github.fga.das.tdd.ntna;

public class ValorLiquido {
	
	private Double valorEmissao;
	private Double percentualAmortizacao;
	
	public ValorLiquido(Double valorEmissao, Double percentualAmortizacao){
		this.valorEmissao = valorEmissao;
		this.percentualAmortizacao = percentualAmortizacao;
	}

	public double calcula() {
		return this.valorEmissao*this.percentualAmortizacao;
	}

}
