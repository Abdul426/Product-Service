package org.hams.productcatalog.service;

import java.util.Optional;

import org.hams.productcatalog.domain.Product;
import org.hams.productcatalog.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;

	public Product createProduct(Product product) {
		return productRepo.save(product);
	}

	public Product getProduct(Long prodId) {
		Optional<Product> findById = productRepo.findById(prodId);
		if (findById.isPresent())
			return findById.get();
		return null;
	}

}
