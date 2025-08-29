package com.nerdev.workshopmongo.config.dto;

import java.io.Serializable;

import com.nerdev.workshopmongo.domain.User;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String email;
	
	public UserDTO() {
	}
	
	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}	
}
