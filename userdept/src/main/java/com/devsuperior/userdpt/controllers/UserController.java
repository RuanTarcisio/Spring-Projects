package com.devsuperior.userdpt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdpt.entities.Users;
import com.devsuperior.userdpt.repositories.UserRepository;

@RestController
@RequestMapping	(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<Users> findAll(){
		List<Users> list = repository.findAll();
		return list;
	}
	
	@GetMapping(value = "/{id}")
	public Users findById(@PathVariable Long id) {
		Users result = repository.findById(id).get();
		
		return result;
	}
	
	public Users insert(@RequestBody Users user) {
		Users result = repository.save(user);
		return result;
	}

}
