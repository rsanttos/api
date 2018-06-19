package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.CalendarDTO;

/**
 * Classe responsável pela requisição do calendário acadêmico à API do SIGAA
 * 
 * @author ramonsantos
 *
 */
public class CalendarRequest extends GenericRequest {
	/**
	 * Construtor da classe
	 */
	public CalendarRequest() {
		url = "calendario/v0.1/calendarios/125046027";
	}

	/**
	 * Método responsável pela requisição de um calendário à API do SIGAA
	 * 
	 * @param token
	 * @return CalendarDTO
	 */
	public String getCalendar(String token) {
		properties.put("Authorization", token);
		properties.put("x-api-key", xApiKey);
		String resultado = super.objectRequest();
		return resultado;
	}

}
