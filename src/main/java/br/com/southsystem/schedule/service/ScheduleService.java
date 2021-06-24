package br.com.southsystem.schedule.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import br.com.southsystem.schedule.entity.Schedule;

public interface ScheduleService {

	Schedule createOrUpdate(Schedule schedule);
	
	void delete(Schedule schedule);
	
	Page<Schedule> findAll(int page, int count);
	
	Optional<Schedule> findById(String id);
	
}
