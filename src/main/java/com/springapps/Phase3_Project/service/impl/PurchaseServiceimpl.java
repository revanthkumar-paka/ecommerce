package com.springapps.Phase3_Project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.Phase3_Project.dao.PurchaseDao;
import com.springapps.Phase3_Project.entity.Purchase;
import com.springapps.Phase3_Project.service.PurchaseService;

@Service
public class PurchaseServiceimpl implements PurchaseService{
	@Autowired
	PurchaseDao purchaseDao;
    
	@Transactional
	@Override
	public int save(Purchase purchase) {
		// TODO Auto-generated method stub
		return purchaseDao.create(purchase);
	}

}
