package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.StudentDTO;

/**
 * Classe responsável por obter as informaçõs de um aluno cadastrado no SIGAA
 * 
 * @author ramonsantos
 *
 */
public class StudentRequest extends GenericRequest {
	/**
	 * Construtor da classe
	 */
	public StudentRequest() {
	}

	/**
	 * Método responsável por obter as informações do aluno que acabou de realizar
	 * login na aplicação
	 * 
	 * @param token
	 * @return StudentDTO
	 */
	public StudentDTO getStudentLoggedIn(String token) {
		StudentDTO studentDto = getUserSIGAA(token);
		if (studentDto.getCpf_cnpj() != null) {
			studentDto = getStudentSIGAA(token, studentDto.getCpf_cnpj());
			return studentDto;
		} else {
			return null;
		}
	}

	/**
	 * Método responsável por obter as informações de um usuário no SIGAA
	 * 
	 * @param token
	 * @return StudentDTO
	 */
	public StudentDTO getUserSIGAA(String token) {
		url = "usuario/v0.1/usuarios/info";
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);
		String resultado = super.objectRequest();
		return StudentDTO.toObject(resultado);
	}

	/**
	 * Método responsável por obter as informações de um aluno no SIGAA
	 * 
	 * @param token
	 * @return StudentDTO
	 */
	public StudentDTO getStudentSIGAA(String token, String cpfCnpj) {
		url = String.format("discente/v0.1/discentes?cpf-cnpj=%s&situacao-discente=%d&sigla-nivel=%s", cpfCnpj, 1, "G");
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);
		String resultado = super.objectRequest();
		return StudentDTO.toObject(resultado);
	}
}
