package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.RegistrationDTO;

public class RegistrationRequest extends GenericRequest {
	public RegistrationRequest(int idStudent) {
		url = "/solicitacoes-matriculas?id-discente=" + idStudent
				+ "&id-situacao-solicitacao=2&ano=2018&periodo=1";
	}

	public RegistrationDTO[] getRegistrations(){
		String resultado = super.objectRequest();
		return RegistrationDTO.toArrayObject(resultado);
	}
	
}
