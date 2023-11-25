package br.com.fiap.previnatech.model;

public class PlanoSaude {
	
	private Long idPlanoSaude;
	private String razaoSocial;
	private String nomeFantasia;
	private String descricaoPlanoDeSaude;
	private int cnpj;
	
	public PlanoSaude(Long idPlanoSaude, String razaoSocial, String nomeFantasia, String descricaoPlanoDeSaude,
			int cnpj) {
		super();
		this.idPlanoSaude = idPlanoSaude;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.descricaoPlanoDeSaude = descricaoPlanoDeSaude;
		this.cnpj = cnpj;
	}
	
	public Long getIdPlanoSaude() {
		return idPlanoSaude;
	}
	
	public void setIdPlanoSaude(Long idPlanoSaude) {
		this.idPlanoSaude = idPlanoSaude;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getDescricaoPlanoDeSaude() {
		return descricaoPlanoDeSaude;
	}
	
	public void setDescricaoPlanoDeSaude(String descricaoPlanoDeSaude) {
		this.descricaoPlanoDeSaude = descricaoPlanoDeSaude;
	}
	
	public int getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
