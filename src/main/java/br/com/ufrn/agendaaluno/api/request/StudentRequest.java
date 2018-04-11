package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.StudentDTO;

public class StudentRequest extends GenericRequest {
	public StudentRequest(String cpf) {
		url = "/discentes?cpf-cnpj=" + cpf;
	}
	
	public StudentDTO getStudentLoggedIn() {
		String resultado = super.objectRequest();
		return StudentDTO.toObject(resultado);
	}
}
