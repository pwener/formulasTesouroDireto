package github.fga.das.tdd;

public class BTN {

	private Double precoUnitarioAnterior;
	private Double taxaReferencial;
	private double precoUnitario = 0;
	private FatorJuros fatorJuros;
	private int qte;
	private double dolar = 0;

	public void setPrecoUnitarioAnterior(Double preco) {
		this.precoUnitarioAnterior = preco;
	}

	public void setTaxaReferencial(Double taxa) {
		this.taxaReferencial = taxa;
	}

	public Double getPrecoUnitarioAnterior() {
		return precoUnitarioAnterior;
	}

	public Double getTaxaReferencial() {
		return taxaReferencial;
	}

	public void calculaPrecoUnitario() {
		setPrecoUnitario(getPrecoUnitarioAnterior() * getTaxaReferencial());
	}

	public Double getPrecoUnitario() {
		return this.precoUnitario;
	}

	public void setPrecoUnitario(double preco) {
		this.precoUnitario = preco;
	}

	public void setFatorJuros(FatorJuros fatorJuros) {
		this.fatorJuros = fatorJuros;
	}
	
	public Double getFatorJuros() {
		return this.fatorJuros.calculaFatorJuros();
	}

	public double getJuros() {
		return getPrecoUnitario() * getFatorJuros();
	}
	
	public double getPrincipal() {
		double principal = 0;
		
		if(dolar != 0) {
			principal = qte * dolar;
		} else if (precoUnitario != 0) {
			principal = qte * precoUnitario;
		}
		
		return (double)Math.round(principal * 100d) / 100d;
	}
	
	public void setQte(int qte) {
		this.qte = qte;
	}
	
	public int getQte() {
		return this.qte;
	}
	
	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public double getDolar() {
		return this.dolar;
	}
}
