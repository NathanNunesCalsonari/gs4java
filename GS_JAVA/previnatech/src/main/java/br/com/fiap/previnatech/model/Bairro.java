package br.com.fiap.previnatech.model;

public class Bairro {
	
	private Long idBairro;
	private String nomeBairro;
	private String zonaBairro;
	private Cidade cidade; 
	
	public Bairro(Long idBairro, String nomeBairro, String zonaBairro, Cidade cidade) {
		this.idBairro = idBairro;
		this.nomeBairro = nomeBairro;
		this.zonaBairro = zonaBairro;
		this.cidade = cidade;
	}
	
	public Long getIdBairro() {
		return idBairro;
	}
	
	public void setIdBairro(Long idBairro) {
		this.idBairro = idBairro;
	}
	
	public String getNomeBairro() {
		return nomeBairro;
	}
	
	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public String getZonaBairro() {
		return zonaBairro;
	}

	public void setZonaBairro(String zonaBairro) {
		this.zonaBairro = zonaBairro;
	}
	
	
}
