package com.sbnz.sbnzBackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.sbnzBackend.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
	

}
