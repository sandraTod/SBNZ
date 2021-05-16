package com.sbnz.sbnzBackend.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbnz.sbnzBackend.model.User;
import com.sbnz.sbnzBackend.service.UserService;


@RestController
@RequestMapping(value = "/api/user")
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(
			value = "/hello",
			method = RequestMethod.GET,
			produces = MediaType.ALL_VALUE
			)
	public ResponseEntity<?> sayHello() throws Exception {
		return new ResponseEntity<String>("hello world", HttpStatus.OK);
	}
	
	@RequestMapping(
			value = "/update",
			method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<?> updateUser(@RequestBody User toUpdate) throws Exception {
		User updated = userService.update(toUpdate);
		return new ResponseEntity<User>(updated, HttpStatus.OK);
	}
	
	@RequestMapping(
			value ="/getAllUsers",
			method =RequestMethod.GET,
			produces =MediaType.APPLICATION_JSON_VALUE
			)
	//@PreAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Collection<User>> getAllUsers(){
		Collection<User> users = userService.getAll();
		System.out.println("OVDE SAM");
		return new ResponseEntity<>(users,HttpStatus.CREATED);
		
	}
}
