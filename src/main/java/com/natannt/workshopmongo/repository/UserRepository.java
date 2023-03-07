package com.natannt.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.natannt.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User,String>{
	
}
