package com.devsuperior.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdpt.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
	
	

}
