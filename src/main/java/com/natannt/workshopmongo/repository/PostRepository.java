package com.natannt.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.natannt.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post,String>{
	
	@Query("{ 'title': {$regex: ?0, $options: 'i'}}")
	List<Post> searchTitle(String Text);
	
	List<Post> findByTitleContainingIgnoreCase(String text);
}
