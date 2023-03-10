package com.natannt.workshopmongo.dto;

import java.io.Serializable;

import com.natannt.workshopmongo.domain.User;

public class AuthorDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;

	/* Constructors */

	public AuthorDTO() {

	}

	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}

	/* Getters and Setters */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
