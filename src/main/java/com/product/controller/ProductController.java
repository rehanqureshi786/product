package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productSer;

	@RequestMapping(value = "addproduct", method = RequestMethod.POST)
	public String addProduct(@RequestBody Product product) {
		return productSer.addProduct(product);
	}

	@RequestMapping(value = "getallproducts")
	public List<Product> getAllProducts() {
		return productSer.getAllProduct();
	}

	@DeleteMapping("/deleteproduct/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		System.out.println("Delete method Called");
		
		System.out.println("Comment added for git changes");
		return productSer.deleteProduct(id);
	}
}
