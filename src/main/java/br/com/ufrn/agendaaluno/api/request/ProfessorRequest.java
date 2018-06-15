package br.com.ufrn.agendaaluno.api.request;

public class ProfessorRequest extends GenericRequest {
	public ProfessorRequest() {

	}
	
	public String getProfessorSIGAA(String token, String cpfCnpj) {
		url = String.format("docente/v0.1/docentes?cpf=%s", cpfCnpj);
		properties.put("x-api-key", xApiKey);
		properties.put("Authorization", token);
		String resultado = super.objectRequest();
		return resultado;
	}
}
