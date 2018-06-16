package br.com.ufrn.agendaaluno.api.request;

public class UndergraduateStudentRequest extends GenericRequest {
	/**
	 * Construtor da classe
	 */
	public UndergraduateStudentRequest() {

	}

	/**
	 * Método responsável por obter as informações de um aluno do SIGAA
	 * 
	 * @param token
	 * @param cpfCnpj
	 * @return String
	 */
	public String getStudentSIGAA(String token, String cpfCnpj) {
		url = String.format("discente/v0.1/discentes?cpf-cnpj=%s&situacao-discente=%d&sigla-nivel=%s", cpfCnpj, 1, "G");
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);
		String resultado = super.objectRequest();
		return resultado;
	}
}
