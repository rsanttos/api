package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.model.user.UndergraduateStudent;
import br.com.ufrn.agendaaluno.api.model.user.UndergraduateStudentFactory;
import br.com.ufrn.agendaaluno.api.model.user.User;
import br.com.ufrn.agendaaluno.api.model.user.UserFactoryImpl;
import br.com.ufrn.agendaaluno.api.request.SigaaRequest;
import br.com.ufrn.agendaaluno.api.request.UndergraduateStudentRequest;

@Service
public class UndergraduateStudentService {

	public UndergraduateStudent getStudentLoggedIn(String token) {
		UndergraduateStudentRequest undergraduateStudentRequest = new UndergraduateStudentRequest();	
		SigaaRequest sigaaRequest = new SigaaRequest();
		String userStr = sigaaRequest.getUserSIGAA(token);	
		System.out.println(userStr);
		UndergraduateStudentFactory ugsFactory = new UndergraduateStudentFactory();
		UserFactoryImpl uFactory = new UserFactoryImpl();
		User user = uFactory.createUserFromJson(userStr);
		
		String studentStr = undergraduateStudentRequest.getStudentSIGAA(token, user.getCpf_cnpj());
		System.out.println(studentStr);
		UndergraduateStudent student = (UndergraduateStudent) ugsFactory.createUserFromJson(studentStr);
		
		return student;
	}
}
