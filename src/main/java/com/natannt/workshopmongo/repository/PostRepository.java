package com.natannt.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.natannt.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post,String>{
	
}
