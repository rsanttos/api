package br.com.ufrn.agendaaluno.api.request;

public class SigaaRequest extends GenericRequest {

	/**
	 * Método responsável por obter as informações de um usuário do SIGAA
	 * 
	 * @param token
	 * @return String
	 */
	public String getUserSIGAA(String token) {
		url = "usuario/v0.1/usuarios/info";
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);
		String resultado = super.objectRequest();
		return resultado;
	}
}
