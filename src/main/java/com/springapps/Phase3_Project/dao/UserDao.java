package com.springapps.Phase3_Project.dao;

import java.util.List;

import com.springapps.Phase3_Project.entity.User;

public interface UserDao {
	
	int create(User user);

	List<User> findUsers();


}
