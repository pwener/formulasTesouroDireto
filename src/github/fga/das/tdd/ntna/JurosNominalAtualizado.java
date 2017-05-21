package github.fga.das.tdd.ntna;

public class JurosNominalAtualizado {
	
	public Double fatorJurosNominalAtualizado;
	public ValorNominalAtualizado valorNominalAtualizado;
	
	public void setFatorJurosNominalAtualizado(Double fatorJurosNominalAtualizado) {
		this.fatorJurosNominalAtualizado = fatorJurosNominalAtualizado;
	}

	public void setValorNominalAtualizado(ValorNominalAtualizado valorNominalAtualizado) {
		this.valorNominalAtualizado = valorNominalAtualizado;
	}

	public double calcula() {
		return this.valorNominalAtualizado.calcula()*this.fatorJurosNominalAtualizado;
	}
	

}
