package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.HolidayDTO;

public class HolidayRequest extends GenericRequest {
	public HolidayRequest() {
		url = "comum/v0.1/feriados?data-feriado-inicial=1518998400000&data-feriado-final=1530921600000";
	}
	
	public HolidayDTO[] getHolidays(String token){
		properties.put("Authorization" , token);
		properties.put("x-api-key", xApiKey);
		String resultado = super.objectRequest();
		HolidayDTO[] holidays = HolidayDTO.toArrayObject(resultado);
		return holidays;
	}
}
