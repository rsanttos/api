package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.model.user.GraduateStudent;
import br.com.ufrn.agendaaluno.api.model.user.GraduateStudentFactory;
import br.com.ufrn.agendaaluno.api.model.user.User;
import br.com.ufrn.agendaaluno.api.model.user.UserFactoryImpl;
import br.com.ufrn.agendaaluno.api.request.GraduateStudentRequest;
import br.com.ufrn.agendaaluno.api.request.SigaaRequest;
import br.com.ufrn.agendaaluno.api.request.StudentRequest;
import br.com.ufrn.agendaaluno.api.util.LevelOfEducation;

@Service
public class GraduateStudentService {

	private StudentRequest sRequest;

	public GraduateStudentService() {
		sRequest = new StudentRequest();
	}

	public GraduateStudent getStudentLoggedIn(String token) {
		SigaaRequest sigaaRequest = new SigaaRequest();
		String userStr = sigaaRequest.getUserSIGAA(token);
		System.out.println(userStr);
		GraduateStudentFactory gsFactory = new GraduateStudentFactory();
		UserFactoryImpl uFactory = new UserFactoryImpl();
		User user = uFactory.createUserFromJson(userStr);

		String studentStr = sRequest.getStudentSIGAA(token, user.getCpf_cnpj(),
				LevelOfEducation.POSTGRADUATE_LATO_SENSU);
		System.out.println(studentStr);
		GraduateStudent student = (GraduateStudent) gsFactory.createUserFromJson(studentStr);

		return student;
	}
}
