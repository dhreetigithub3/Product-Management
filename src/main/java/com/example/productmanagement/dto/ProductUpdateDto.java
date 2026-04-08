package com.example.productmanagement.dto;

public class ProductUpdateDto {
	
	Long id;
	String name;
	String description;
	int price;
	String photoUrl;
	
	public ProductUpdateDto() {
		super();
	}

	public ProductUpdateDto(Long id, String name, String description, int price, String photoUrl) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.photoUrl = photoUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	@Override
	public String toString() {
		return "ProductUpdateDto [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", photoUrl=" + photoUrl + "]";
	}
	
}
