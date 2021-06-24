package br.com.southsystem.schedule.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.southsystem.schedule.entity.Schedule;
import br.com.southsystem.schedule.repository.ScheduleRepository;
import br.com.southsystem.schedule.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	
	@Autowired
	private ScheduleRepository scheduleRepository;
	
	@Override
	public Schedule createOrUpdate(Schedule schedule) {
		return this.scheduleRepository.save(schedule);
	}

	@Override
	public void delete(Schedule schedule) {
		this.scheduleRepository.delete(schedule);		
	}

	@Override
	public Page<Schedule> findAll(int page, int count) {
		Pageable pages = PageRequest.of(page, count);
		return this.scheduleRepository.findAll(pages);
	}

	@Override
	public Optional<Schedule> findById(String id) {
		return this.scheduleRepository.findById(id);
	}

}
