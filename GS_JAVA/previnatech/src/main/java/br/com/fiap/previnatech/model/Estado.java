package br.com.fiap.previnatech.model;

public class Estado {
	
	private Long idEstado;
	private String siglaEstado;
	private String nomeEstado;
	
	public Estado(Long idEstado, String siglaEstado, String nomeEstado) {
		this.idEstado = idEstado;
		this.siglaEstado = siglaEstado;
		this.nomeEstado = nomeEstado;
	}
	
	public Long getIdEstado() {
		return idEstado;
	}
	
	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	
	public String getSiglaEstado() {
		return siglaEstado;
	}
	
	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}
	
	public String getNomeEstado() {
		return nomeEstado;
	}
	
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	

}
