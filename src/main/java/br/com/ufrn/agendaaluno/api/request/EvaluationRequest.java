package br.com.ufrn.agendaaluno.api.request;

/**
 * Classe responsável pela requisição das avaliações de uma determinada turma
 * que estão cadastradas no SIGAA.
 * 
 * @author ramonsantos
 *
 */
public class EvaluationRequest extends GenericRequest {
	/**
	 * Construtor da classe.
	 */
	public EvaluationRequest() {

	}

	/**
	 * Método responsável por obter as avaliações cadastradas em uma turma no SIGAA.
	 * 
	 * @param token
	 * @param idClass
	 * @return String
	 */
	public String getClassEvaluations(String token, int idClass) {
		url = String.format("turma/v0.1/atividades-avaliativas?id-turma=%d", idClass);
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);
		String resultado = super.objectRequest();
		return resultado;
	}
}
