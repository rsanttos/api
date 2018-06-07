package br.com.ufrn.agendaaluno.api.request;

import br.com.ufrn.agendaaluno.api.dto.HolidayDTO;

/**
 * Classe responsável pela requisição de informações sobre feriados durante um
 * determinado período.
 * 
 * @author ramonsantos
 *
 */
public class HolidayRequest extends GenericRequest {
	/**
	 * Construtor da classe.
	 */
	public HolidayRequest() {
		url = "comum/v0.1/feriados?data-feriado-inicial=1518998400000&data-feriado-final=1530921600000";
	}

	/**
	 * Método responsável por obter as informações dos feriados.
	 * 
	 * @param token
	 * @return
	 */
	public HolidayDTO[] getHolidays(String token) {
		properties.put("Authorization", token);
		properties.put("x-api-key", xApiKey);
		String resultado = super.objectRequest();
		HolidayDTO[] holidays = HolidayDTO.toArrayObject(resultado);
		return holidays;
	}
}
