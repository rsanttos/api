package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.AuthenticationDTO;

public class AuthenticationRequest extends GenericRequest {

	private AuthenticationDTO authDTO;

	private final String clientID = "agenda-do-aluno-id";
	private final String clientSecret = "segredo";
	private final String grantType = "client_credentials";

	public AuthenticationRequest() {
		url = "authz-server/oauth/token?client_id=" + clientID + "&client_secret=" + clientSecret + "&grant_type="
				+ grantType;
		authDTO = new AuthenticationDTO();
	}

	public AuthenticationDTO authenticate() {
		methodType = "POST";
		String result = super.objectRequest();
		authDTO = AuthenticationDTO.toObject(result);
		return authDTO;
	}
}
