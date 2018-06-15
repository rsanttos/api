package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.GraduateStudentDTO;
import br.com.ufrn.agendaaluno.api.model.user.GraduateStudent;
import br.com.ufrn.agendaaluno.api.model.user.GraduateStudentFactory;
import br.com.ufrn.agendaaluno.api.request.GraduateStudentRequest;

@Service
public class GraduateStudentService {

	public GraduateStudent getStudentLoggedIn(String token) {
		GraduateStudentRequest graduateStudentRequest = new GraduateStudentRequest();	
		String userStr = graduateStudentRequest.getUserSIGAA(token);	
		System.out.println(userStr);
		GraduateStudentFactory gsFactory = new GraduateStudentFactory();
		GraduateStudent student = (GraduateStudent) gsFactory.createUserFromJson(userStr);
		
		String studentStr = graduateStudentRequest.getStudentSIGAA(token, student.getCpf_cnpj());
		System.out.println(studentStr);
		student = (GraduateStudent) gsFactory.createUserFromJson(studentStr);
		
		return student;
	}
}
