package com.springapps.Phase3_Project.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.Phase3_Project.dao.ProductDao;
import com.springapps.Phase3_Project.entity.Product;
import com.springapps.Phase3_Project.entity.User;
import com.springapps.Phase3_Project.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
   @Autowired
   private ProductDao productDao;

@Override
@Transactional
public int save(Product product) {
	// TODO Auto-generated method stub
	return productDao.create(product);
}

@Override
public List<Product> getproducts() {
	// TODO Auto-generated method stub
	List<Product> products=productDao.findProducts();
	Collections.sort(products);
	return products;
}
	
}
