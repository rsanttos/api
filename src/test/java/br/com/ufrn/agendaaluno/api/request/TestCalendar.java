package br.com.ufrn.agendaaluno.api.request;

import org.junit.Test;

import br.com.ufrn.agendaaluno.api.dto.AuthenticationDTO;
import br.com.ufrn.agendaaluno.api.dto.CalendarDTO;
import junit.framework.TestCase;

public class TestCalendar extends TestCase {
	
	CalendarRequest cr = new CalendarRequest();
	AuthenticationRequest ar = new AuthenticationRequest();
	AuthenticationDTO aDto = ar.authenticate();
	CalendarDTO c = cr.getCalendar(aDto.getAccess_token());

	@Test
	public void testRequestAuthentication() {
		assertEquals(200, ar.getCodigoResposta());
	}
	
	@Test
	public void testRequestCalendar() {
		assertEquals(200, cr.getCodigoResposta());
	}

	@Test
	public void testGetCalendar() {
		assertNotNull(c);
	}
}
