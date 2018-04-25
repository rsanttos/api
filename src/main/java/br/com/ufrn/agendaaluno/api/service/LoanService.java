package br.com.ufrn.agendaaluno.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.LoanDTO;
import br.com.ufrn.agendaaluno.api.model.Loan;
import br.com.ufrn.agendaaluno.api.request.LoanRequest;

@Service
public class LoanService {
	public List<LoanDTO> getLoans(String cpf, String token) {
		LoanRequest loanRequest = new LoanRequest();
		LoanDTO[] loansDto = loanRequest.getLoans(cpf, token);
		List<LoanDTO> loans = new ArrayList<LoanDTO>(); 
		for(int i = 0 ; i < loansDto.length ; i++) {
			if(loansDto[i].getData_devolucao() == 0) {
				loans.add(loansDto[i]);
			}
		}
		return loans;
	}
}
