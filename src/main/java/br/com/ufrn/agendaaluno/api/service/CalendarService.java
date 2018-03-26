package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.CalendarDTO;
import br.com.ufrn.agendaaluno.api.request.CalendarRequest;

@Service
public class CalendarService {

	public CalendarDTO getCalendar(String token) {
		CalendarRequest cRequest = new CalendarRequest();
		return cRequest.getCalendar(token);
	}
	
}
