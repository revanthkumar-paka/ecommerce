package com.springapps.Phase3_Project.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.Phase3_Project.dao.UserDao;
import com.springapps.Phase3_Project.entity.User;
import com.springapps.Phase3_Project.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;

	@Override
	@Transactional
	public int save(User user) {
		// TODO Auto-generated method stub
		
		return userDao.create(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		List<User> users=userDao.findUsers();
		Collections.sort(users);
		return users;
	}

	

}
