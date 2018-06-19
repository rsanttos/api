package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.model.user.Student;
import br.com.ufrn.agendaaluno.api.model.user.StudentFactory;
import br.com.ufrn.agendaaluno.api.model.user.User;
import br.com.ufrn.agendaaluno.api.model.user.UserFactoryImpl;
import br.com.ufrn.agendaaluno.api.request.SigaaRequest;
import br.com.ufrn.agendaaluno.api.request.StudentRequest;
import br.com.ufrn.agendaaluno.api.util.LevelOfEducation;

@Service
public class StudentService {
	private StudentRequest sRequest;

	public StudentService() {
		sRequest = new StudentRequest();
	}

	public Student getStudentLoggedIn(String token) {
		SigaaRequest sigaaRequest = new SigaaRequest();
		String userStr = sigaaRequest.getUserSIGAA(token);
		System.out.println(userStr);
		UserFactoryImpl uFactory = new UserFactoryImpl();
		User user = uFactory.createUserFromJson(userStr);

		StudentFactory sFactory = new StudentFactory();
		String studentStr = sRequest.getStudentSIGAA(token, user.getCpf_cnpj(), LevelOfEducation.GRADUATION);
		System.out.println(studentStr);
		Student student = (Student) sFactory.createUserFromJson(studentStr);

		return student;
	}
}
