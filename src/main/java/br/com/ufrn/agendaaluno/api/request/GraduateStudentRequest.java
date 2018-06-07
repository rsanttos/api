package br.com.ufrn.agendaaluno.api.request;

/**
 * Classe responsável pela requisição de informações de um aluno de pós
 * graduação na API do SIGAA.
 * 
 * @author ramonsantos
 *
 */
public class GraduateStudentRequest extends GenericRequest {
	/**
	 * Construtor da classe.
	 */
	public GraduateStudentRequest() {

	}

	/**
	 * Método responsável por obter as informações de um usuário do SIGAA.
	 * 
	 * @param token
	 * @return String
	 */
	public String getUserSIGAA(String token) {
		url = "usuario/v0.1/usuarios/info";
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);
		String resultado = super.objectRequest();
		return resultado;
	}

	/**
	 * Método responsável por obter as informações de um aluno do SIGAA.
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
