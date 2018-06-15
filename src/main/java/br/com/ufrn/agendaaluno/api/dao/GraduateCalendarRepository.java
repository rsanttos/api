package br.com.ufrn.agendaaluno.api.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ufrn.agendaaluno.api.model.calendar.GraduateCalendar;

/**
 * Interface responsável pelas operações de calendário com banco de dados.
 * 
 * @author ramonsantos
 *
 */
public interface GraduateCalendarRepository extends CrudRepository<GraduateCalendar, Long> {
	public GraduateCalendar findByYear(int year);
}
