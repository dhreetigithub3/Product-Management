package com.example.productmanagement.service;

import java.util.List;

import com.example.productmanagement.dto.ProductRequestDto;
import com.example.productmanagement.dto.ProductUpdateDto;
import com.example.productmanagement.entity.Product;


public interface ProductService {
	
	String addProduct(ProductRequestDto prod);
	String updateProduct(ProductUpdateDto prod);
	String deleteProduct(Long prodId);
	Product viewProduct(Long prodId);
	List<Product> viewAllProducts();
}
