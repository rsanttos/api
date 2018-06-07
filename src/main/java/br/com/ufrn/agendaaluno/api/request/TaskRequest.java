package br.com.ufrn.agendaaluno.api.request;

/**
 * Classe responsável por requisitar as tarefas cadastradas em uma turma virtual
 * do SIGAA.
 * 
 * @author ramonsantos
 *
 */
public class TaskRequest extends GenericRequest {
	/**
	 * Construtor da classe.
	 */
	public TaskRequest() {

	}

	/**
	 * Método responsável por obter as tarefas cadastradas em uma determinada turma
	 * virtual.
	 * 
	 * @param token
	 * @param idClass
	 * @return String
	 */
	public String getClassTasks(String token, int idClass) {
		url = String.format("turma/v0.1/tarefas?id-turma=%d", idClass);
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);
		String resultado = super.objectRequest();
		return resultado;
	}
}
