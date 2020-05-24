package org.hams.productcatalog.controller;

import org.hams.productcatalog.domain.Product;
import org.hams.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		Product createdProd = productService.createProduct(product);
		return createdProd;
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		Product prod = productService.getProduct(id);
		return prod;
	}
}
