package br.com.ufrn.agendaaluno.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrn.agendaaluno.api.dto.AuthenticationDTO;
import br.com.ufrn.agendaaluno.api.dto.CalendarDTO;
import br.com.ufrn.agendaaluno.api.dto.HolidayDTO;
import br.com.ufrn.agendaaluno.api.model.Calendar;
import br.com.ufrn.agendaaluno.api.request.CalendarRequest;
import br.com.ufrn.agendaaluno.api.request.HolidayRequest;
import br.com.ufrn.agendaaluno.api.service.AuthenticationService;
import br.com.ufrn.agendaaluno.api.service.CalendarService;

@RestController
public class CalendarController {
	
	@Autowired
	private AuthenticationService authService;

	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public Calendar getCalendar() {
		System.out.println("\n---> CLIENTE REQUISITOU CALENDÁRIO <---");
		AuthenticationDTO authDto = authService.authenticate();

		CalendarRequest calendarRequest = new CalendarRequest();
		HolidayRequest holidayRequest = new HolidayRequest();

		CalendarDTO calendarDto = calendarRequest.getCalendar(authDto.getAccess_token());
		HolidayDTO[] holidaysDto = holidayRequest.getHolidays(authDto.getAccess_token());
		calendarDto.setHolidays(holidaysDto);

		Calendar calendar = calendarDto.toEntity();
		System.out.println("\n---> CALENDÁRIO GERADO E ENVIADO <---");
		return calendar;
	}
}
