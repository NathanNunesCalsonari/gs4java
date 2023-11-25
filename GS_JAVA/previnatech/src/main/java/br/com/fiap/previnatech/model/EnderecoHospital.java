package br.com.fiap.previnatech.model;

public class EnderecoHospital {
	
	private Long idEnderecoHospitalar;
	private int numeroLogradouro;
	private String descricaoComplemento;
	private Logradouro logradouro;
	
	public EnderecoHospital(Long idEnderecoHospitalar, int numeroLogradouro, String descricaoComplemento,
		Logradouro logradouro) {
		super();
		this.idEnderecoHospitalar = idEnderecoHospitalar;
		this.numeroLogradouro = numeroLogradouro;
		this.descricaoComplemento = descricaoComplemento;
		this.logradouro = logradouro;
	}
	
	public Long getIdEnderecoHospitalar() {
		return idEnderecoHospitalar;
	}
	
	public void setIdEnderecoHospitalar(Long idEnderecoHospitalar) {
		this.idEnderecoHospitalar = idEnderecoHospitalar;
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
