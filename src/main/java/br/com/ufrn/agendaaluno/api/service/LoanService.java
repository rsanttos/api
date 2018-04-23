package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.LoanDTO;
import br.com.ufrn.agendaaluno.api.request.LoanRequest;

@Service
public class LoanService {
	public LoanDTO[] getLoans(String cpf, String token) {
		LoanRequest loanRequest = new LoanRequest();
		return loanRequest.getLoans(cpf, token);
	}
}
