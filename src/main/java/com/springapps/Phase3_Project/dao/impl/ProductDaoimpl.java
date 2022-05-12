package com.springapps.Phase3_Project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.Phase3_Project.dao.ProductDao;
import com.springapps.Phase3_Project.entity.Product;
import com.springapps.Phase3_Project.entity.User;

@Repository
public class ProductDaoimpl implements ProductDao {
    
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int create(Product product) {
		// TODO Auto-generated method stub
		return (int) hibernateTemplate.save(product);
	}

	@Override
	public List<Product> findProducts() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Product.class);
	}
       
}
