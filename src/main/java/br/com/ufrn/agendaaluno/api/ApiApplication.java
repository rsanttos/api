package br.com.ufrn.agendaaluno.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.ufrn.agendaaluno.api.dto.AuthenticationDTO;
import br.com.ufrn.agendaaluno.api.dto.CalendarDTO;
import br.com.ufrn.agendaaluno.api.dto.HolidayDTO;
import br.com.ufrn.agendaaluno.api.model.Calendar;
import br.com.ufrn.agendaaluno.api.request.CalendarRequest;
import br.com.ufrn.agendaaluno.api.request.HolidayRequest;
import br.com.ufrn.agendaaluno.api.service.AuthenticationService;
import br.com.ufrn.agendaaluno.api.service.CalendarService;

@SpringBootApplication
public class ApiApplication {

	@Autowired
	private AuthenticationService authService;

	@Autowired
	private CalendarService calendarService;

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner inicializaBD() {
		return (args) -> {
			AuthenticationDTO authDto = authService.authenticate();	
		
			CalendarRequest calendarRequest = new CalendarRequest();
			HolidayRequest holidayRequest = new HolidayRequest();
			
			CalendarDTO calendarDto = calendarRequest.getCalendar(authDto.getAccess_token());
			HolidayDTO[] holidaysDto = holidayRequest.getHolidays(authDto.getAccess_token());
			calendarDto.setHolidays(holidaysDto);
			
			Calendar calendar = calendarDto.toEntity();
			
			calendarService.save(calendar);
		};
	}
}
