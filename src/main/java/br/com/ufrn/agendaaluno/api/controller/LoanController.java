package br.com.ufrn.agendaaluno.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrn.agendaaluno.api.dto.LoanDTO;
import br.com.ufrn.agendaaluno.api.service.LoanService;

@RestController
public class LoanController {

	@Autowired
	private LoanService loanService;	

	@RequestMapping(value = "/student/loans/{cpf}/{token}", method = RequestMethod.GET)
	public List<LoanDTO> getLoans(@PathVariable String cpf, @PathVariable String token) {
		System.out.println("\n---> CLIENTE REQUISITOU EMPRÉSTIMOS DO USUÁRIO <---");
		System.out.println("---> CPF DO USUÁRIO: " + cpf + " <---");
		System.out.println("\n---> EMPRÉSTIMOS GERADOS E ENVIADOS <---");
		return loanService.getLoans(cpf, token);
	}
}