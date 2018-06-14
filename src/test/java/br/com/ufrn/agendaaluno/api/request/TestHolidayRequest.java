package br.com.ufrn.agendaaluno.api.request;

import org.junit.Test;

import br.com.ufrn.agendaaluno.api.dto.AuthenticationDTO;
import br.com.ufrn.agendaaluno.api.dto.HolidayDTO;
import junit.framework.TestCase;

/**
 * Classe de teste para HolidayRequest
 * 
 * @author ramonsantos
 *
 */
public class TestHolidayRequest extends TestCase {

	AuthenticationRequest ar = new AuthenticationRequest();
	AuthenticationDTO aDto = ar.authenticate();
	HolidayRequest hr = new HolidayRequest();
	
	/**
	 * Método para realização de teste do método que traz os feriados
	 */
	@Test
	public void testGetHolidays() {
		HolidayDTO[] h = hr.getHolidays(aDto.getAccess_token());
		assertNotNull(h);
	}
}
