package br.com.ufrn.agendaaluno.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dao.CalendarRepository;
import br.com.ufrn.agendaaluno.api.dao.HolidayRepository;
import br.com.ufrn.agendaaluno.api.model.calendar.Calendar;
import br.com.ufrn.agendaaluno.api.model.calendar.Holiday;

@Service
public class CalendarService {

	@Autowired
	private CalendarRepository calendarRepo;
	
	@Autowired
	private HolidayRepository holidayRepo;
	
	public Calendar getCalendarByAno(int year) {
		return calendarRepo.findByYear(year);
	}
	
	public void save(Calendar calendar) {
		
		for(Holiday h : calendar.getHolidays()) {
			holidayRepo.save(h);
		}
		
		calendarRepo.save(calendar);
	}
}
