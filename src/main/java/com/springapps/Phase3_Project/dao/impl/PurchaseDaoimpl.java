package com.springapps.Phase3_Project.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.Phase3_Project.dao.PurchaseDao;
import com.springapps.Phase3_Project.entity.Purchase;

@Repository
public class PurchaseDaoimpl implements PurchaseDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public int create(Purchase purchase) {
		// TODO Auto-generated method stub
		return (int) hibernateTemplate.save(purchase);
	}

}
