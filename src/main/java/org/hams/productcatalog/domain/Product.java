package org.hams.productcatalog.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	private String name;
	private String category;
	private String description;
	private Double price;
	private Long availableCount;
	@Embedded
	private Account seller;
	private boolean isListingAvailable;

	public boolean isListingAvailable() {
		return isListingAvailable;
	}

	public void setListingAvailable(boolean isListingAvailable) {
		this.isListingAvailable = isListingAvailable;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getAvailableCount() {
		return availableCount;
	}

	public void setAvailableCount(Long availableCount) {
		this.availableCount = availableCount;
	}

	public Account getSeller() {
		return seller;
	}

	public void setSeller(Account seller) {
		this.seller = seller;
	}

}
