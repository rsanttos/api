package br.com.ufrn.agendaaluno.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.ufrn.agendaaluno.api.service.AuthenticationService;
import br.com.ufrn.agendaaluno.api.service.CalendarService;

/**
 * Classe responsável pela execução do projeto.
 * @author ramonsantos
 *
 */
@SpringBootApplication
public class ApiApplication {

	@Autowired
	private AuthenticationService authService;

	@Autowired
	private CalendarService calendarService;

	/**
	 * Método principal para execução.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner inicializaBD() {
		return (args) -> {
//			AuthenticationDTO authDto = authService.authenticate();
//
//			CalendarRequest calendarRequest = new CalendarRequest();
//			HolidayRequest holidayRequest = new HolidayRequest();
//
//			CalendarDTO calendarDto = calendarRequest.getCalendar(authDto.getAccess_token());
//			HolidayDTO[] holidaysDto = holidayRequest.getHolidays(authDto.getAccess_token());
//			calendarDto.setHolidays(holidaysDto);
//
//			Calendar calendar = calendarDto.toEntity();
//
//			calendarService.save(calendar);
//			
			// Calendar calendar = new Calendar();
			// calendar.setYear(2018);
			// calendar.setStartPeriod(151736760);
			// calendar.setStartExtraordinaryEnrollment(1515808060);
			// calendar.setStartOnlineEnrollment(1814151216);
			// calendar.setStartReEnrollment(1515484819);
			// calendar.setEndExtraordinaryEnrollment(144849562);
			// calendar.setEndOnlineEnrollment(84849596);
			// calendar.setEndPeriod(95958421);
			// calendar.setEndReEnrollment(84516230);
			//
			// Holiday h1 = new Holiday(15154898, "Feriado 1");
			// Holiday h2 = new Holiday(15154898, "Feriado 2");
			// Holiday h3 = new Holiday(15154898, "Feriado 3");
			// List<Holiday> holidays = new ArrayList<Holiday>();
			// holidays.add(h1);
			// holidays.add(h2);
			// holidays.add(h3);
			//
			// calendar.setHolidays(holidays);
			//
			// calendarService.save(calendar);
		};
	}
}
