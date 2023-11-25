package br.com.fiap.previnatech.model;

import java.math.BigDecimal;

public class Funcionario {
		
	private Long idFunc;
    private Long idSuperior;
    private String nmFunc;
    private String nrCpf;
    private String nrRg;
    private String dtNascimento;
    private Double vlSalario;
    private String dtCadastro;
    private String nmUsuario;
    
	public Funcionario(Long idFunc, Long idSuperior, String nmFunc, String nrCpf, String nrRg, String dtNascimento,
			Double vlSalario, String dtCadastro, String nmUsuario) {
		super();
		this.idFunc = idFunc;
		this.idSuperior = idSuperior;
		this.nmFunc = nmFunc;
		this.nrCpf = nrCpf;
		this.nrRg = nrRg;
		this.dtNascimento = dtNascimento;
		this.vlSalario = vlSalario;
		this.dtCadastro = dtCadastro;
		this.nmUsuario = nmUsuario;
	}

	public Long getIdFunc() {
		return idFunc;
	}

	public void setIdFunc(Long idFunc) {
		this.idFunc = idFunc;
	}

	public Long getIdSuperior() {
		return idSuperior;
	}

	public void setIdSuperior(Long idSuperior) {
		this.idSuperior = idSuperior;
	}

	public String getNmFunc() {
		return nmFunc;
	}

	public void setNmFunc(String nmFunc) {
		this.nmFunc = nmFunc;
	}

	public String getNrCpf() {
		return nrCpf;
	}

	public void setNrCpf(String nrCpf) {
		this.nrCpf = nrCpf;
	}

	public String getNrRg() {
		return nrRg;
	}

	public void setNrRg(String nrRg) {
		this.nrRg = nrRg;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Double getVlSalario() {
		return vlSalario;
	}

	public void setVlSalario(Double vlSalario) {
		this.vlSalario = vlSalario;
	}

	public String getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(String dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}
    
    

}
