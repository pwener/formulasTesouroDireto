package github.fga.das.tdd.ntna;

public class JurosNominalAtualizado {
	
	public FatorJuros fatorJuros;
	public ValorNominalAtualizado valorNominalAtualizado;
	
	public void setFatorJuros(FatorJuros fatorJuros) {
		this.fatorJuros = fatorJuros;
	}

	public void setValorNominalAtualizado(ValorNominalAtualizado valorNominalAtualizado) {
		this.valorNominalAtualizado = valorNominalAtualizado;
	}

	public double calcula() {
		return this.valorNominalAtualizado.calcula()*this.fatorJuros.calcula();
	}
	

}
