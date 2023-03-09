package com.natannt.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natannt.workshopmongo.domain.User;
import com.natannt.workshopmongo.dto.UserDTO;
import com.natannt.workshopmongo.repository.UserRepository;
import com.natannt.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
 
	public User fromDto(UserDTO objDto) {
		return new User(objDto.getEmail(), objDto.getName(), objDto.getEmail());
	}
	
}
