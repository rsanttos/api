package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.TaskDTO;

public class TaskRequest extends GenericRequest {
	public TaskRequest() {
		
	}
	public String getClassEvaluations(String token, int idClass) {
		url = String.format("turma/v0.1/tarefas?id-turma=%d", idClass);
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);		
		String resultado = super.objectRequest();
		return resultado;
	}
}
