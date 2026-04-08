package com.example.productmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.productmanagement.dto.ProductRequestDto;
import com.example.productmanagement.dto.ProductUpdateDto;
import com.example.productmanagement.entity.Product;
import com.example.productmanagement.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService {
	
	ProductRepository repo;
	public ProductServiceImplementation(ProductRepository repo) {
		super();
		this.repo = repo;
	}
	
	@Override
	public String addProduct(ProductRequestDto prod) {
		Product product = new Product();
		product.setName(prod.getName());
		product.setDescription(prod.getDescription());
		product.setPrice(prod.getPrice());
		product.setPhotoUrl(prod.getPhotoUrl());
		repo.save(product);
		return "Product added successfully!";
	}
	
	@Override
	public String updateProduct(ProductUpdateDto prod) {
		Product product = new Product(prod.getId(), prod.getName(), prod.getPrice(), prod.getDescription(), prod.getPhotoUrl());
		repo.save(product);
		return "Product updated successfully!";
	}
	
	@Override
	public String deleteProduct(Long prodId) {
		repo.deleteById(prodId);
		return "Product deleted successfully!";
	}
	
	@Override
	public Product viewProduct(Long prodId) {
		return repo.findById(prodId).get();
	}
	
	@Override
	public List<Product> viewAllProducts() {
		return repo.findAll();
	}

}