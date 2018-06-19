package br.com.ufrn.agendaaluno.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrn.agendaaluno.api.dto.AuthenticationDTO;
import br.com.ufrn.agendaaluno.api.model.calendar.Calendar;
import br.com.ufrn.agendaaluno.api.model.calendar.Holiday;
import br.com.ufrn.agendaaluno.api.service.AuthenticationService;
import br.com.ufrn.agendaaluno.api.service.CalendarService;
import br.com.ufrn.agendaaluno.api.service.HolidayService;

@RestController
public class CalendarController {
	
	@Autowired
	private AuthenticationService authService;
	
	@Autowired
	private CalendarService calendarService;
	
	@Autowired
	private HolidayService holidayService;

	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public Calendar getCalendar() {
		System.out.println("\n---> CLIENTE REQUISITOU CALENDÁRIO <---");
		AuthenticationDTO authDto = authService.authenticate();

		Calendar calendar = calendarService.getCalendarSigaa(authDto.getAccess_token());		
		Holiday[] holidays = holidayService.getHolidays(authDto.getAccess_token());
		calendar.setHolidays(holidays);
		System.out.println("\n---> CALENDÁRIO GERADO E ENVIADO <---");
		
		return calendar;
	}
}
