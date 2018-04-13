package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.StudentDTO;

public class StudentRequest extends GenericRequest {
	public StudentRequest() {
	}
	
	public StudentDTO getStudentLoggedIn(String token) {
		StudentDTO studentDto = getUserSIGAA(token);
		if(studentDto.getCpf_cnpj() != null) {
			studentDto = getStudentSIGAA(token, studentDto.getCpf_cnpj());
			return studentDto;
		} else {
			return null;
		}
	}
	
	public StudentDTO getUserSIGAA(String token) {
		url = "usuario/v0.1/usuarios/info";
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);
		String resultado = super.objectRequest();
		return StudentDTO.toObject(resultado);		
	}
	
	public StudentDTO getStudentSIGAA(String token, String cpfCnpj) {
		url = String.format("discente/v0.1/discentes?cpf-cnpj=%s&situacao-discente=%d&sigla-nivel=%s", cpfCnpj, 1, "G");
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);		
		String resultado = super.objectRequest();
		return StudentDTO.toObject(resultado);		
	}
}
