package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.LoanDTO;

public class LoanRequest extends GenericRequest {
	public LoanRequest() {
		url = "biblioteca/v0.1/emprestimos?cpf-cnpj-usuario=10904368408";
	}
	
	public LoanDTO[] getLoans(String token) {
		properties.put("Authorization" , token);
		properties.put("x-api-key", xApiKey);
		String resultado = super.objectRequest();
		return LoanDTO.toArrayObject(resultado);
	}
}
