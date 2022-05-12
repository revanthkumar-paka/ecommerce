package com.springapps.Phase3_Project.service;

import java.util.List;

import com.springapps.Phase3_Project.entity.User;

public interface UserService {
	
	int save(User user);
	
	List<User> getUsers();

}
