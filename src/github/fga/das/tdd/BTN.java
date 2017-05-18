package github.fga.das.tdd;

public class BTN {

	private Double precoUnitarioAnterior;
	private Double taxaReferencial;
	private double precoUnitario;
	private FatorJuros fatorJuros;
	private int qte;
	private double dolar;

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
		double principal = qte * precoUnitario;
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
