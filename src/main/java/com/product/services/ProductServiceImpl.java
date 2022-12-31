package com.product.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub

		if (productRepo.save(product) != null) {
			return "Product created Successfully!!!";
		}

		else {
			return "Product Already exists !!";
		}
	}

	@Override
	public Product getProductByName(String name) {
		// TODO Auto-generated method stub
		return productRepo.getProductByName(name);
	}

	@Override
	public Optional<Product> getProductById(int id) {
		// TODO Auto-generated method stub

		Optional<Product> product = productRepo.findById(id);

		return product;
	}

	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		System.out.println("Stage1 : ");
		boolean delete = productRepo.findById(id).isPresent();
		System.out.println("Stage2 : ");
		if(delete)
		{
		 productRepo.deleteById(id);
		}
		else
		{
			return "Product not exist in DB with ID : "+id;
		}
		
		return "Product Deleted with ID : "+id;
	}

}
