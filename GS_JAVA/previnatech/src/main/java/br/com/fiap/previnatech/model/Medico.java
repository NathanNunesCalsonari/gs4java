package br.com.fiap.previnatech.model;

public class Medico {
	
	private Long idFunc;
	private int crm;
	private String especialidade;
	private Funcionario funcionario;
	private String dataCadastro;
	private String nmUsuario;
	
	public Medico(Long idFunc, int crm, String especialidade, Funcionario funcionario, String dataCadastro,
			String nmUsuario) {
		super();
		this.idFunc = idFunc;
		this.crm = crm;
		this.especialidade = especialidade;
		this.funcionario = funcionario;
		this.dataCadastro = dataCadastro;
		this.nmUsuario = nmUsuario;
	}

	public Long getIdFunc() {
		return idFunc;
	}
	
	public void setIdFunc(Long idMedico) {
		this.idFunc = idMedico;
	}
	
	public int getCrm() {
		return crm;
	}
	
	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	
	

}
