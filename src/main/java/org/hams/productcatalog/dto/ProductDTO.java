package org.hams.productcatalog.dto;

public class ProductDTO {

	private Long productId;
	private String name;
	private String category;
	private String description;
	private Double price;

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

	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", name=" + name + ", category=" + category + ", description="
				+ description + ", price=" + price + "]";
	}

}
