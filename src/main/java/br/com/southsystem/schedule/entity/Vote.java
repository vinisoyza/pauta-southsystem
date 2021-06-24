package br.com.southsystem.schedule.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Vote {
	
	@Id
	private String id;
	
	private String vote;
	
	private Schedule schedule;
	
	private User user;
	
}
