package br.com.ufrn.agendaaluno.api.request;

import org.junit.Test;

import br.com.ufrn.agendaaluno.api.dto.AuthenticationDTO;
import br.com.ufrn.agendaaluno.api.dto.CalendarDTO;
import junit.framework.TestCase;

/**
 * Classe para testar CalendarRequest
 * 
 * @author ramonsantos
 *
 */
public class TestCalendar extends TestCase {

	CalendarRequest cr = new CalendarRequest();
	AuthenticationRequest ar = new AuthenticationRequest();
	AuthenticationDTO aDto = ar.authenticate();
	CalendarDTO c = cr.getCalendar(aDto.getAccess_token());

	/**
	 * Método para testar a autenticação com sucesso
	 */
	@Test
	public void testRequestAuthentication() {
		assertEquals(200, ar.getCodigoResposta());
	}

	/**
	 * Método para testar a requisição de calendário
	 */
	@Test
	public void testRequestCalendar() {
		assertEquals(200, cr.getCodigoResposta());
	}

	/**
	 * Método para testar a obtenção de calendário
	 */
	@Test
	public void testGetCalendar() {
		assertNotNull(c);
	}
}
