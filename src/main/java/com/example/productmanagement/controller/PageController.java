package com.example.productmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping("/")
    public String home() {
        return "redirect:/admin_home.html";
    }
	
//	@GetMapping("/product-manage")
//    public String productManage() {
//        return "redirect:/product_manage.html";
//    }
//	
//	@GetMapping("/add-product")
//    public String addProduct() {
//        return "redirect:/add_product.html";
//    }
//	
//	@GetMapping("/delete-product")
//    public String deleteProduct() {
//        return "redirect:/delete_product.html";
//    }
//	
//	@GetMapping("/update-product")
//    public String updateProduct() {
//        return "redirect:/update_product.html";
//    }
//	
//	@GetMapping("/search-product")
//    public String searchProduct() {
//        return "redirect:/search_product.html";
//    }
//	
//	@GetMapping("/view-products")
//    public String viewProducts() {
//        return "redirect:/view_products.html";
//    }
//	
//	@GetMapping("/view-all-products")
//    public String viewAllProducts() {
//        return "redirect:/view_products.html";
//    }
}
