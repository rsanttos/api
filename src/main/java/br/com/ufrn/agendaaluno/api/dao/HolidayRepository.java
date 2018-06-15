package br.com.ufrn.agendaaluno.api.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ufrn.agendaaluno.api.model.calendar.Holiday;
/**
 * Interface responsável pelas operações de feriados com banco de dados.
 * 
 * @author ramonsantos
 *
 */
public interface HolidayRepository extends CrudRepository<Holiday, Long> {

}
