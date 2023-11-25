package br.com.fiap.previnatech.model;

public class Sintoma {
	private Long idSintoma;
	private String descricaoSintomas;
	private String descricaoDuracao;
	
	public Sintoma(Long idSintoma, String descricaoSintomas, String descricaoDuracao) {
		super();
		this.idSintoma = idSintoma;
		this.descricaoSintomas = descricaoSintomas;
		this.descricaoDuracao = descricaoDuracao;
	}

	public Long getIdSintoma() {
		return idSintoma;
	}

	public void setIdSintoma(Long idSintoma) {
		this.idSintoma = idSintoma;
	}

	public String getDescricaoSintomas() {
		return descricaoSintomas;
	}

	public void setDescricaoSintomas(String descricaoSintomas) {
		this.descricaoSintomas = descricaoSintomas;
	}

	public String getDescricaoDuracao() {
		return descricaoDuracao;
	}

	public void setDescricaoDuracao(String descricaoDuracao) {
		this.descricaoDuracao = descricaoDuracao;
	}
	
	

}
