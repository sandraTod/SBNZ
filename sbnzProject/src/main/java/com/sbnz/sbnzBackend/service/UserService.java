package com.sbnz.sbnzBackend.service;

import java.util.Collection;

import com.sbnz.sbnzBackend.model.User;

public interface UserService {

	User update(User toUpdate);
	Collection<User> getAll();

}
