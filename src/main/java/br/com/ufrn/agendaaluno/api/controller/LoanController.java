package br.com.ufrn.agendaaluno.api.controller;

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

	@RequestMapping(value = "/student/loans/{token}", method = RequestMethod.GET)
	public LoanDTO[] getLoans(@PathVariable String token) {
		return loanService.getLoans(token);
	}
}
