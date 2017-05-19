package github.fga.das.tdd;

public class FatorRendimento {

	private Double ipca1;
	private Double ipca0;
	private Integer diasCorridos;
	private Integer diasCorridosEmQuinzena;

	public FatorRendimento() {
		// Default constructor
	}
	
	public FatorRendimento(Double ipca1, Double ipca0, 
			Integer diasCorridos, Integer diasCorridosEmQuinzena) {
		this.ipca1 = ipca1;
		this.ipca0 = ipca0;
		this.diasCorridos = diasCorridos;
		this.diasCorridosEmQuinzena = diasCorridosEmQuinzena;
	}
	
	public void setIPCA1(Double ipca1) {
		this.ipca1 = ipca1;
	}

	public void setIPCA0(Double ipca0) {
		this.ipca0 = ipca0;
	}

	public void setDiasCorridos(Integer dias) {
		this.diasCorridos = dias;
	}

	public void setDiasCorridosEmQuinzena(Integer dias) {
		this.diasCorridosEmQuinzena = dias;
	}

	public double calcula() {
		Double ipcaQuociente = ipca1/ipca0;
		Double numeroDiasQuociente = (double) (diasCorridos/diasCorridosEmQuinzena);

		return Math.pow(ipcaQuociente, numeroDiasQuociente);
	}
}
