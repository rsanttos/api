package br.com.ufrn.agendaaluno.api.request;

public class GraduateStudentRequest extends GenericRequest {

	public GraduateStudentRequest() {
		
	}
	
	public String getUserSIGAA(String token) {
		url = "usuario/v0.1/usuarios/info";
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);
		String resultado = super.objectRequest();
		return resultado;		
	}
	

	public String getStudentSIGAA(String token, String cpfCnpj) {
		url = String.format("discente/v0.1/discentes?cpf-cnpj=%s&situacao-discente=%d&sigla-nivel=%s", cpfCnpj, 1, "G");
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);		
		String resultado = super.objectRequest();
		return resultado;		
	}
}
