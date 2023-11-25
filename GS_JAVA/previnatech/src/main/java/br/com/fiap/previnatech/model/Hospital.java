package br.com.fiap.previnatech.model;

public class Hospital {
        private Long idHospital;
        private String nomeHospital;
        private String dataFundacao;
        private String especialidade;
        private String dtCadastro;
        private String nmUsuario;
        
		public Hospital(Long idHospital, String nomeHospital, String dataFundacao, String especialidade,
				String dtCadastro, String nmUsuario) {
			super();
			this.idHospital = idHospital;
			this.nomeHospital = nomeHospital;
			this.dataFundacao = dataFundacao;
			this.especialidade = especialidade;
			this.dtCadastro = dtCadastro;
			this.nmUsuario = nmUsuario;
		}

		public Long getIdHospital() {
			return idHospital;
		}

		public void setIdHospital(Long idHospital) {
			this.idHospital = idHospital;
		}

		public String getNomeHospital() {
			return nomeHospital;
		}

		public void setNomeHospital(String nomeHospital) {
			this.nomeHospital = nomeHospital;
		}

		public String getDataFundacao() {
			return dataFundacao;
		}

		public void setDataFundacao(String dataFundacao) {
			this.dataFundacao = dataFundacao;
		}

		public String getEspecialidade() {
			return especialidade;
		}

		public void setEspecialidade(String especialidade) {
			this.especialidade = especialidade;
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
