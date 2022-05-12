package com.springapps.Phase3_Project.dao;

import java.util.List;

import com.springapps.Phase3_Project.entity.Product;
import com.springapps.Phase3_Project.entity.User;

public interface ProductDao {

	int create(Product product);

	List<Product> findProducts();
}
