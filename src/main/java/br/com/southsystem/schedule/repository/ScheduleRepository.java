package br.com.southsystem.schedule.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.southsystem.schedule.entity.Schedule;

public interface ScheduleRepository extends MongoRepository<Schedule, String> {
	 
	Optional<Schedule> findById(String id);
	
}
