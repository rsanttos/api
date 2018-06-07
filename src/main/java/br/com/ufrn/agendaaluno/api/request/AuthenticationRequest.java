package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.AuthenticationDTO;

/**
 * Classe responsável pela requisição de autenticação na API do SIGAA.
 * 
 * @author ramonsantos
 *
 */
public class AuthenticationRequest extends GenericRequest {

	private AuthenticationDTO authDTO;

	private final String clientID = "agenda-do-aluno-id";
	private final String clientSecret = "segredo";
	private final String grantType = "client_credentials";

	/**
	 * Construtor da classe.
	 */
	public AuthenticationRequest() {
		url = "authz-server/oauth/token?client_id=" + clientID + "&client_secret=" + clientSecret + "&grant_type="
				+ grantType;
		authDTO = new AuthenticationDTO();
	}

	/**
	 * Método responsável pela realização da autenticação.
	 * @return AuthenticationDTO
	 */
	public AuthenticationDTO authenticate() {
		methodType = "POST";
		String result = super.objectRequest();
		authDTO = AuthenticationDTO.toObject(result);
		return authDTO;
	}
}
