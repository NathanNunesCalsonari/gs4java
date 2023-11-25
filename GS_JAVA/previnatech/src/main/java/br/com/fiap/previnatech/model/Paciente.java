package br.com.fiap.previnatech.model;

public class Paciente {
	
	 public Long idPaciente;
	 public String nomePaciente;
	 public String cpfPaciente;
	 public String rgPaciente;
	 public String dataNascimento;
	 public String sexoBiologico;
	 public String tipoSanguineo;
	 public Double alturaPaciente;
	 public Double pesoPaciente;
	 private String dtCadastro;
	 private String nmUsuario;
	 
	public Paciente(Long idPaciente, String nomePaciente, String cpfPaciente, String rgPaciente, String dataNascimento,
			String sexoBiologico, String tipoSanguineo, Double alturaPaciente, Double pesoPaciente, String dtCadastro,
			String nmUsuario) {
		super();
		this.idPaciente = idPaciente;
		this.nomePaciente = nomePaciente;
		this.cpfPaciente = cpfPaciente;
		this.rgPaciente = rgPaciente;
		this.dataNascimento = dataNascimento;
		this.sexoBiologico = sexoBiologico;
		this.tipoSanguineo = tipoSanguineo;
		this.alturaPaciente = alturaPaciente;
		this.pesoPaciente = pesoPaciente;
		this.dtCadastro = dtCadastro;
		this.nmUsuario = nmUsuario;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getCpfPaciente() {
		return cpfPaciente;
	}

	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}

	public String getRgPaciente() {
		return rgPaciente;
	}

	public void setRgPaciente(String rgPaciente) {
		this.rgPaciente = rgPaciente;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexoBiologico() {
		return sexoBiologico;
	}

	public void setSexoBiologico(String sexoBiologico) {
		this.sexoBiologico = sexoBiologico;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public Double getAlturaPaciente() {
		return alturaPaciente;
	}

	public void setAlturaPaciente(Double alturaPaciente) {
		this.alturaPaciente = alturaPaciente;
	}

	public Double getPesoPaciente() {
		return pesoPaciente;
	}

	public void setPesoPaciente(Double pesoPaciente) {
		this.pesoPaciente = pesoPaciente;
	}

	public String getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(String dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}
	
	
	 
	 
	
}
