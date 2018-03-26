package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.CalendarDTO;

public class CalendarRequest extends GenericRequest {

	public CalendarRequest() {
		url = "calendario/v0.1/calendarios/125046027";
	}
	
	public CalendarDTO getCalendar(String token) {
		properties.put("Authorization" , token);
		properties.put("x-api-key", xApiKey);
		String resultado = super.objectRequest();
		return CalendarDTO.toObject(resultado);
	}
	
}
