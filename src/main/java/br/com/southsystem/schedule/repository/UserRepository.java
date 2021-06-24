package br.com.southsystem.schedule.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.southsystem.schedule.entity.User;

public interface UserRepository extends MongoRepository<User, String>{

	Optional<User> findById(String id);
	
}
