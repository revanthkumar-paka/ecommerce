package com.springapps.Phase3_Project.service;


import java.util.List;

import com.springapps.Phase3_Project.entity.Product;

public interface ProductService {

	int save(Product product);

	List<Product> getproducts();
	
	
}
