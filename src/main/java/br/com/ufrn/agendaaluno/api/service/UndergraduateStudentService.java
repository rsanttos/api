package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.model.user.UndergraduateStudent;
import br.com.ufrn.agendaaluno.api.model.user.UndergraduateStudentFactory;
import br.com.ufrn.agendaaluno.api.model.user.User;
import br.com.ufrn.agendaaluno.api.model.user.UserFactoryImpl;
import br.com.ufrn.agendaaluno.api.request.SigaaRequest;
import br.com.ufrn.agendaaluno.api.request.StudentRequest;
import br.com.ufrn.agendaaluno.api.util.LevelOfEducation;

@Service
public class UndergraduateStudentService {
	
	private StudentRequest sRequest;
	
	public UndergraduateStudentService () {
		sRequest = new StudentRequest();
	}

	public UndergraduateStudent getStudentLoggedIn(String token) {
		SigaaRequest sigaaRequest = new SigaaRequest();
		String userStr = sigaaRequest.getUserSIGAA(token);	
		System.out.println(userStr);
		UndergraduateStudentFactory ugsFactory = new UndergraduateStudentFactory();
		UserFactoryImpl uFactory = new UserFactoryImpl();
		User user = uFactory.createUserFromJson(userStr);
		
		String studentStr = sRequest.getStudentSIGAA(token, user.getCpf_cnpj(), LevelOfEducation.GRADUATION);
		System.out.println(studentStr);
		UndergraduateStudent student = (UndergraduateStudent) ugsFactory.createUserFromJson(studentStr);
		
		return student;
	}
}
