package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.EvaluationDTO;

public class EvaluationRequest extends GenericRequest {
	public EvaluationRequest() {
		
	}
	
	public String getClassEvaluations(String token, int idClass) {
		url = String.format("turma/v0.1/atividades-avaliativas?id-turma=%d", idClass);
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);		
		String resultado = super.objectRequest();
		return resultado;
	}
}
