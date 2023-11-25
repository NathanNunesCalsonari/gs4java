package br.com.fiap.previnatech.model;

public class PacientePlanoSaude {
	
	private Long idPacientePs;
	private int numeroCarteira;
	private PlanoSaude planoSaude;
	
	public PacientePlanoSaude(Long idPacientePs, int numeroCarteira, PlanoSaude planoSaude) {
		super();
		this.idPacientePs = idPacientePs;
		this.numeroCarteira = numeroCarteira;
		this.planoSaude = planoSaude;
	}

	public Long getIdPacientePs() {
		return idPacientePs;
	}

	public void setIdPacientePs(Long idPacientePs) {
		this.idPacientePs = idPacientePs;
	}

	public int getNumeroCarteira() {
		return numeroCarteira;
	}

	public void setNumeroCarteira(int numeroCarteira) {
		this.numeroCarteira = numeroCarteira;
	}

	public PlanoSaude getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(PlanoSaude planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	
	
	

}
