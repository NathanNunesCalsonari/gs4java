package br.com.fiap.previnatech.model;

public class EmailPaciente {
	
	private Long idEmail;
	private String nomeEmail;
	private String statusEmail;
	private Paciente paciente;
	
	public EmailPaciente(Long idEmail, String nomeEmail, String statusEmail, Paciente paciente) {
		super();
		this.idEmail = idEmail;
		this.nomeEmail = nomeEmail;
		this.statusEmail = statusEmail;
		this.paciente = paciente;
	}

	public Long getIdEmail() {
		return idEmail;
	}
	
	public void setIdEmail(Long idEmail) {
		this.idEmail = idEmail;
	}
	
	public String getNomeEmail() {
		return nomeEmail;
	}
	
	public void setNomeEmail(String nomeEmail) {
		this.nomeEmail = nomeEmail;
	}
	
	public String getStatusEmail() {
		return statusEmail;
	}
	
	public void setStatusEmail(String statusEmail) {
		this.statusEmail = statusEmail;
	}
	
	

}
