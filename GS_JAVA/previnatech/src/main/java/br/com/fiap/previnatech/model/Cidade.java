package br.com.fiap.previnatech.model;

public class Cidade {
	
	private Long idCidade;
	private String nomeCidade;
	private int numeroDdd;
	private Estado estado; 
	
	public Cidade(Long idCidade, String nomeCidade, int numeroDdd, Estado estado) {
		this.idCidade = idCidade;
		this.nomeCidade = nomeCidade;
		this.numeroDdd = numeroDdd;
		this.estado = estado;
	}	
	
	public Long getIdCidade() {
		return idCidade;
	}
	
	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}
	
	public String getNomeCidade() {
		return nomeCidade;
	}
	
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	
	public int getNumeroDdd() {
		return numeroDdd;
	}
	
	public void setNumeroDdd(int numeroDdd) {
		this.numeroDdd = numeroDdd;
	}
	

	
}
