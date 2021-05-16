package com.sbnz.sbnzBackend.service.implementation;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbnz.sbnzBackend.model.User;
import com.sbnz.sbnzBackend.repository.UserRepository;
import com.sbnz.sbnzBackend.service.UserService;



@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User update(User toUpdate) {
		// TODO Auto-generated method stub
		User old = userRepository.getOne(toUpdate.getId());
		old.setLastname((toUpdate.getLastname()));
		User saved = userRepository.save(old);
		return saved;
		
	}

	@Override
	public Collection<User> getAll() {
		return userRepository.findAll();
	}
	
	
	

}
