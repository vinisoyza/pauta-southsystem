package br.com.southsystem.schedule.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.southsystem.schedule.entity.Vote;

public interface VoteRepository extends MongoRepository<Vote, String>{
	
	Optional<Vote> findById(String id);
	
}
