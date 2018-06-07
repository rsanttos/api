package br.com.ufrn.agendaaluno.api.request;

/**
 * Classe responsável pela requisição de turmas à API do SIGAA
 * 
 * @author ramonsantos
 *
 */
public class ClassRequest extends GenericRequest {
	/**
	 * Construtor da classe
	 */
	public ClassRequest() {

	}

	/**
	 * Método responsável por obter as turmas em que um aluno está participando da
	 * API do SIGAA
	 * 
	 * @param token
	 * @param idStudent
	 * @return String
	 */
	public String getStudentClass(String token, int idStudent) {
		url = String.format("matricula/v0.1/solicitacoes-matriculas?id-discente=%d&ano=%d&periodo=%d", idStudent, 2018,
				1);
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);
		String resultado = super.objectRequest();
		return resultado;
	}
}
