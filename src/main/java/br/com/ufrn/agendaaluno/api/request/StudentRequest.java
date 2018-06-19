package br.com.ufrn.agendaaluno.api.request;

/**
 * Classe responsável por obter as informaçõs de um aluno cadastrado no SIGAA
 * 
 * @author ramonsantos
 *
 */
public class StudentRequest extends GenericRequest {
	/**
	 * Construtor da classe
	 */
	public StudentRequest() {
	}

	/**
	 * Método responsável por obter as informações de um aluno do SIGAA
	 * 
	 * @param token
	 * @param cpfCnpj
	 * @return String
	 */
	public String getStudentSIGAA(String token, String cpfCnpj, String nivelEnsino) {
		url = String.format("discente/v0.1/discentes?cpf-cnpj=%s&situacao-discente=%d&sigla-nivel=%s", cpfCnpj, 1, nivelEnsino);
		//url = String.format("discente/v0.1/discentes?cpf-cnpj=%s&situacao-discente=%d", cpfCnpj, 1);
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);
		String resultado = super.objectRequest();
		return resultado;
	}
}
