package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.StudentDTO;
import br.com.ufrn.agendaaluno.api.request.StudentRequest;

/**
 * Classe de serviço responsável pela intermediação entre os controllers e as
 * requisições
 * 
 * @author ramonsantos
 *
 */
@Service
public class StudentService {

	public StudentDTO getStudentLoggedIn(String token) {
		StudentRequest studentRequest = new StudentRequest();
		StudentDTO student = studentRequest.getStudentLoggedIn(token);
		return student;
	}

}
