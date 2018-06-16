package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.model.user.Professor;
import br.com.ufrn.agendaaluno.api.model.user.ProfessorFactory;
import br.com.ufrn.agendaaluno.api.model.user.User;
import br.com.ufrn.agendaaluno.api.model.user.UserFactoryImpl;
import br.com.ufrn.agendaaluno.api.request.ProfessorRequest;
import br.com.ufrn.agendaaluno.api.request.SigaaRequest;

@Service
public class ProfessorService {

	public Professor getProfessorLoggedIn(String token) {
		User u = new User();
		Professor p = new Professor();
		SigaaRequest sigaaRequest = new SigaaRequest();
		ProfessorRequest pRequest = new ProfessorRequest();
		String userStr = sigaaRequest.getUserSIGAA(token);
		System.out.println(userStr);
		UserFactoryImpl uFactory = new UserFactoryImpl();
		u = uFactory.createUserFromJson(userStr);
		String professorStr = pRequest.getProfessorSIGAA(token, u.getCpf_cnpj());
		ProfessorFactory pFactory = new ProfessorFactory();
		p = (Professor) pFactory.createUserFromJson(professorStr);
		return p;
	}
}
