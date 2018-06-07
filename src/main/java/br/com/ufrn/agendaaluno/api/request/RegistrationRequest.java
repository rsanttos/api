package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.RegistrationDTO;

/**
 * Classe responsável por requisitar as solicitações de matrícula de um usuário
 * cadastrado no SIGAA.
 * 
 * @author ramonsantos
 *
 */
public class RegistrationRequest extends GenericRequest {
	/**
	 * Construtor da classe.
	 * 
	 * @param idStudent
	 */
	public RegistrationRequest(int idStudent) {
		url = "/solicitacoes-matriculas?id-discente=" + idStudent + "&id-situacao-solicitacao=2&ano=2018&periodo=1";
	}

	/**
	 * Método responsável por obter as solicitações de matrícula de um usuário
	 * cadastrado no SIGAA.
	 * 
	 * @return RegistrationDTO[]
	 */ 
	public RegistrationDTO[] getRegistrations() {
		String resultado = super.objectRequest();
		return RegistrationDTO.toArrayObject(resultado);
	}

}
