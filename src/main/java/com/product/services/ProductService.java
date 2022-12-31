package com.product.services;

import java.util.List;
import java.util.Optional;

import com.product.entity.Product;


public interface ProductService {

	public List<Product> getAllProduct();
	public String addProduct(Product product);
	public Product getProductByName(String name);
	public Optional<Product> getProductById(int id);
	public String deleteProduct(int id);
	
	
}
