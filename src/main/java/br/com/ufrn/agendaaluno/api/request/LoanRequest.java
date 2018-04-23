package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.LoanDTO;

public class LoanRequest extends GenericRequest {
	public LoanRequest() {;
	}
	
	public LoanDTO[] getLoans(String cpf, String token) {
		url = String.format("biblioteca/v0.1/emprestimos?cpf-cnpj-usuario=%s", cpf);
		properties.put("Authorization" , token);
		properties.put("x-api-key", xApiKey);
		String resultado = super.objectRequest();
		return LoanDTO.toArrayObject(resultado);
	}
}
