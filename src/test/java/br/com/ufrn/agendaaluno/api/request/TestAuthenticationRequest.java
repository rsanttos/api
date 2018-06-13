package br.com.ufrn.agendaaluno.api.request;

import org.junit.Test;

import br.com.ufrn.agendaaluno.api.dto.AuthenticationDTO;
import junit.framework.TestCase;

public class TestAuthenticationRequest extends TestCase {
	AuthenticationRequest ar = new AuthenticationRequest();
	AuthenticationDTO aDto = ar.authenticate();
	
	@Test
	public void testRequest() {
		assertEquals(200, ar.getCodigoResposta());
	}

	@Test
	public void testAuthenticate() {
		assertNotNull(aDto);
	}
}
