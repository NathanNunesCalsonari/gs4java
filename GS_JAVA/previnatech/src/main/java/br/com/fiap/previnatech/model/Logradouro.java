package br.com.fiap.previnatech.model;

public class Logradouro {
	
	private Long idLogradouro;
	private String nomeLogradouro;
	private int numeroCep;
	private Bairro bairro; 
	
	public Logradouro(Long idLogradouro, String nomeLogradouro, int numeroCep, Bairro bairro) {
		this.idLogradouro = idLogradouro;
		this.nomeLogradouro = nomeLogradouro;
		this.numeroCep = numeroCep;
		this.bairro = bairro;
	}
	
	public Long getIdLogradouro() {
		return idLogradouro;
	}
	
	public void setIdLogradouro(Long idLogradouro) {
		this.idLogradouro = idLogradouro;
	}
	
	public String getNomeLogradouro() {
		return nomeLogradouro;
	}
	
	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}
	
	public int getNumeroCep() {
		return numeroCep;
	}
	
	public void setNumeroCep(int numeroCep) {
		this.numeroCep = numeroCep;
	}
	
	

}
