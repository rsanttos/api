package br.com.ufrn.agendaaluno.api.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ufrn.agendaaluno.api.model.Holiday;

public interface HolidayRepository extends CrudRepository<Holiday, Long> {

}
