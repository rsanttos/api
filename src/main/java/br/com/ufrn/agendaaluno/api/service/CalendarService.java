package br.com.ufrn.agendaaluno.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dao.GraduateCalendarRepository;
import br.com.ufrn.agendaaluno.api.dao.HolidayRepository;
import br.com.ufrn.agendaaluno.api.model.calendar.GraduateCalendar;
import br.com.ufrn.agendaaluno.api.model.calendar.Holiday;
/**
 * Classe de serviço responsável pela intermediação entre os controllers e as
 * requisições
 * 
 * @author ramonsantos
 *
 */
@Service
public class CalendarService {

	@Autowired
	private GraduateCalendarRepository calendarRepo;
	
	@Autowired
	private HolidayRepository holidayRepo;
	
	public GraduateCalendar getCalendarByAno(int year) {
		return calendarRepo.findByYear(year);
	}
	
	public void save(GraduateCalendar calendar) {
		
		for(Holiday h : calendar.getHolidays()) {
			holidayRepo.save(h);
		}
		
		calendarRepo.save(calendar);
	}
}
