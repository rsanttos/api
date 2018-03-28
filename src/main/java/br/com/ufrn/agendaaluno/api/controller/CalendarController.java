package br.com.ufrn.agendaaluno.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrn.agendaaluno.api.dto.AuthenticationDTO;
import br.com.ufrn.agendaaluno.api.dto.CalendarDTO;
import br.com.ufrn.agendaaluno.api.dto.HolidayDTO;
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
	public CalendarDTO getCalendar() {
		AuthenticationDTO authDto = authService.authenticate();	
		CalendarDTO calendar = calendarService.getCalendar(authDto.getAccess_token());
		HolidayDTO[] holidays = holidayService.getHolidays(authDto.getAccess_token());
		calendar.setHolidays(holidays);
		return calendar;
	}
}
