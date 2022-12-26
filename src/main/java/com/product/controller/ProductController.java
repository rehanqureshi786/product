package com.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	List<Product> list = new ArrayList<Product>();

	@RequestMapping(value = "addproduct", method = RequestMethod.POST)
	public Product addProduct(@RequestBody Product product) {
		list.add(product);
		return product;
	}

	@RequestMapping(value = "getallproducts")
	public List<Product> getAllProducts() {
		return list;
	}

}
