package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.ClassDTO;

public class ClassRequest extends GenericRequest {

	public ClassRequest() {
		
	}
	
	public ClassDTO[] getStudentClass(String token, int idStudent) {
		url = String.format("matricula/v0.1/solicitacoes-matriculas?id-discente=%d&ano=%d&periodo=%d", idStudent, 2018, 1);
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);		
		String resultado = super.objectRequest();
		return ClassDTO.toArrayObject(resultado);
	}
}
