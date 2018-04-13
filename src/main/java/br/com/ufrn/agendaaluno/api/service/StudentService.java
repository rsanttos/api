package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.StudentDTO;
import br.com.ufrn.agendaaluno.api.request.StudentRequest;

@Service
public class StudentService {

	public StudentDTO getStudentLoggedIn(String token) {
		StudentRequest studentRequest = new StudentRequest();		
		StudentDTO student = studentRequest.getStudentLoggedIn(token);
		return student;
	}
	
}
