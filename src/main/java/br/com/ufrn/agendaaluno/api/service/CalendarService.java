package br.com.ufrn.agendaaluno.api.service;


import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.CalendarDTO;
import br.com.ufrn.agendaaluno.api.model.calendar.Calendar;
import br.com.ufrn.agendaaluno.api.request.CalendarRequest;

@Service
public class CalendarService {

//	@Autowired
//	private GraduateCalendarRepository calendarRepo;
	
//	@Autowired
//	private HolidayRepository holidayRepo;
	
	public Calendar getCalendarSigaa(String token) {
		CalendarRequest cRequest = new CalendarRequest();
		String resultado = cRequest.getCalendar(token);
		CalendarDTO cDto = new CalendarDTO();
		Calendar c = cDto.toObject(resultado);
		return c;
	}
	
//	public GraduateCalendar getCalendarByAno(int year) {
//		return calendarRepo.findByYear(year);
//	}
//	
//	public void save(GraduateCalendar calendar) {
//		
//		for(Holiday h : calendar.getHolidays()) {
//			holidayRepo.save(h);
//		}
//		
//		calendarRepo.save(calendar);
//	}
}
