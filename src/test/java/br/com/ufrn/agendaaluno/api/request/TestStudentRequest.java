package br.com.ufrn.agendaaluno.api.request;

import org.junit.Test;

import junit.framework.TestCase;

public class TestStudentRequest extends TestCase {

	StudentRequest sr = new StudentRequest();
	
	@Test
	public void teste() {
		assertEquals(200, sr.getCodigoResposta());
	}
	
	
}
