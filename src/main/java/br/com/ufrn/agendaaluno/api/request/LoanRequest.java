package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.LoanDTO;

/**
 * Classe responsável por obter informações sobre empréstimos de um usuário nas
 * bibliotecas da UFRN.
 * 
 * @author ramonsantos
 *
 */
public class LoanRequest extends GenericRequest {
	/**
	 * Construtor da classe.
	 */
	public LoanRequest() {
		;
	}

	/**
	 * Método responsável pela requisição dos empréstimos realizados nas bibliotecas
	 * da UFRN por um usuário do SIGAA.
	 * 
	 * @param cpf
	 * @param token
	 * @return LoanDTO[]
	 */
	public LoanDTO[] getLoans(String cpf, String token) {
		url = String.format("biblioteca/v0.1/emprestimos?cpf-cnpj-usuario=%s", cpf);
		properties.put("Authorization", token);
		properties.put("x-api-key", xApiKey);
		String resultado = super.objectRequest();
		return LoanDTO.toArrayObject(resultado);
	}
}
