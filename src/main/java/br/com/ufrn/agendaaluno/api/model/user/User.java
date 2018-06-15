package br.com.ufrn.agendaaluno.api.model.user;

/**
 * Classe de modelo para usuários
 * 
 * @author ramonsantos
 *
 */
public abstract class User {
	private String cpf_cnpj;

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

}
