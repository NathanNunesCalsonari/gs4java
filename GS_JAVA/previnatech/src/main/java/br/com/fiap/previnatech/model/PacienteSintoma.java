package br.com.fiap.previnatech.model;

public class PacienteSintoma {
	public Long idPacienteSintoma;
	public String dataInicio;
	public String dataFim;
	public Sintoma sintoma;
	
	public PacienteSintoma(Long idPacienteSintoma, String dataInicio, String dataFim, Sintoma sintoma) {
		super();
		this.idPacienteSintoma = idPacienteSintoma;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.sintoma = sintoma;
	}

	public Long getIdPacienteSintoma() {
		return idPacienteSintoma;
	}

	public void setIdPacienteSintoma(Long idPacienteSintoma) {
		this.idPacienteSintoma = idPacienteSintoma;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	

}
