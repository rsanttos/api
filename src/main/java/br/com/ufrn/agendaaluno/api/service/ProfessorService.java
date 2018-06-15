package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.model.user.Professor;
import br.com.ufrn.agendaaluno.api.model.user.ProfessorFactory;
import br.com.ufrn.agendaaluno.api.request.ProfessorRequest;
import br.com.ufrn.agendaaluno.api.request.SigaaRequest;

@Service
public class ProfessorService {

	public Professor getProfessorLoggedIn(String token) {
		Professor p = new Professor();
		SigaaRequest sigaaRequest = new SigaaRequest();
		ProfessorRequest pRequest = new ProfessorRequest();
		String userStr = sigaaRequest.getUserSIGAA(token);
		System.out.println(userStr);
		ProfessorFactory pFactory = new ProfessorFactory();
		p = (Professor) pFactory.createUserFromJson(userStr);
		String professorStr = pRequest.getProfessorSIGAA(token, p.getCpf_cnpj());
		p = (Professor) pFactory.createUserFromJson(professorStr);
		return p;
	}
}
