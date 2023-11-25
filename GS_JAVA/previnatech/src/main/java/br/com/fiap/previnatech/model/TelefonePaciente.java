package br.com.fiap.previnatech.model;

public class TelefonePaciente {
	
	private Long idTelefonePaciente;
	private int numeroDdi;
	private int numeroDdd;
	private int numeroTelefone;
	private String tipoDeTelefone;
	private String statusTelefone;
	private Paciente paciente;
	
	public TelefonePaciente(Long idTelefonePaciente, int numeroDdi, int numeroDdd, int numeroTelefone,
			String tipoDeTelefone, String statusTelefone, Paciente paciente) {
		super();
		this.idTelefonePaciente = idTelefonePaciente;
		this.numeroDdi = numeroDdi;
		this.numeroDdd = numeroDdd;
		this.numeroTelefone = numeroTelefone;
		this.tipoDeTelefone = tipoDeTelefone;
		this.statusTelefone = statusTelefone;
		this.paciente = paciente;
	}

	public Long getIdTelefonePaciente() {
		return idTelefonePaciente;
	}
	
	public void setIdTelefonePaciente(Long idTelefonePaciente) {
		this.idTelefonePaciente = idTelefonePaciente;
	}
	
	public int getNumeroDdi() {
		return numeroDdi;
	}
	
	public void setNumeroDdi(int numeroDdi) {
		this.numeroDdi = numeroDdi;
	}
	
	public int getNumeroDdd() {
		return numeroDdd;
	}
	
	public void setNumeroDdd(int numeroDdd) {
		this.numeroDdd = numeroDdd;
	}
	
	public int getNumeroTelefone() {
		return numeroTelefone;
	}
	
	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	public String getTipoDeTelefone() {
		return tipoDeTelefone;
	}
	public void setTipoDeTelefone(String tipoDeTelefone) {
		this.tipoDeTelefone = tipoDeTelefone;
	}
	
	public String getStatusTelefone() {
		return statusTelefone;
	}
	
	public void setStatusTelefone(String statusTelefone) {
		this.statusTelefone = statusTelefone;
	}
	
	

}
