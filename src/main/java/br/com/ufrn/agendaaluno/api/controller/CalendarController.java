package br.com.ufrn.agendaaluno.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrn.agendaaluno.api.model.Calendar;
import br.com.ufrn.agendaaluno.api.service.CalendarService;

@RestController
public class CalendarController {	
	@Autowired
	private CalendarService calendarService;
	
	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public Calendar getCalendar() {
		Calendar calendar = calendarService.getCalendarByAno(2018);
		return calendar;
	}
}
