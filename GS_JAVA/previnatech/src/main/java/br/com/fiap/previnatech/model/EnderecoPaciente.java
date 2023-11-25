package br.com.fiap.previnatech.model;

public class EnderecoPaciente {
	
	public Long idEnderecoPaciente;
	public int numeroLogradouro;
	public String descricaoComplemento;
	public Paciente paciente;
	public Logradouro logradouro;
	
	public EnderecoPaciente(Long idEnderecoPaciente, int numeroLogradouro, String descricaoComplemento,
			Paciente paciente, Logradouro logradouro) {
		super();
		this.idEnderecoPaciente = idEnderecoPaciente;
		this.numeroLogradouro = numeroLogradouro;
		this.descricaoComplemento = descricaoComplemento;
		this.paciente = paciente;
		this.logradouro = logradouro;
	}

	public Long getIdEnderecoPaciente() {
		return idEnderecoPaciente;
	}

	public void setIdEnderecoPaciente(Long idEnderecoPaciente) {
		this.idEnderecoPaciente = idEnderecoPaciente;
	}

	public int getNumeroLogradouro() {
		return numeroLogradouro;
	}

	public void setNumeroLogradouro(int numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	public String getDescricaoComplemento() {
		return descricaoComplemento;
	}

	public void setDescricaoComplemento(String descricaoComplemento) {
		this.descricaoComplemento = descricaoComplemento;
	}
	
	
	

}
