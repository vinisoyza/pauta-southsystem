package br.com.southsystem.schedule.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {
	
	@PostMapping(path = {"/createSchedule"})
	public String createSchedule(String schedule, String obs) {
		
		return "sucess";
	}
	
}
