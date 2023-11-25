package br.com.fiap.previnatech.model;

public class Consulta {
	
	private Long idConsulta;
	private String dataHoraConsulta;
	private String tipoConsulta;
	private PacienteSintoma pacienteSintoma;
	private Funcionario funcionario;
	private Hospital hospital;
	
	public Consulta(Long idConsulta, String dataHoraConsulta, String tipoConsulta, PacienteSintoma pacienteSintoma,
			Funcionario funcionario, Hospital hospital) {
		super();
		this.idConsulta = idConsulta;
		this.dataHoraConsulta = dataHoraConsulta;
		this.tipoConsulta = tipoConsulta;
		this.pacienteSintoma = pacienteSintoma;
		this.funcionario = funcionario;
		this.hospital = hospital;
	}

	public Long getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(Long idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getDataHoraConsulta() {
		return dataHoraConsulta;
	}

	public void setDataHoraConsulta(String dataHoraConsulta) {
		this.dataHoraConsulta = dataHoraConsulta;
	}

	public String getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public PacienteSintoma getPacienteSintoma() {
		return pacienteSintoma;
	}

	public void setPacienteSintoma(PacienteSintoma pacienteSintoma) {
		this.pacienteSintoma = pacienteSintoma;
	}
	
	

}
