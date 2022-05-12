package com.springapps.Phase3_Project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.Phase3_Project.dao.UserDao;
import com.springapps.Phase3_Project.entity.User;

@Repository
public class UserDaoimpl implements UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;


	@Override
	public int create(User user) {
		return (int) hibernateTemplate.save(user);
	}


	@Override
	public List<User> findUsers() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(User.class);
	}


	
	

}
