package de.glamazon.guiprototype.gruppe1.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.glamazon.model.Category;
import de.glamazon.model.Picture;
import de.glamazon.model.Product;

public class Product {
	private String productNumber;
	private String name;
	private float price;
	private Picture picture;
	private String description;
	private List<Category> categories;
	
//getter/setter
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Picture getPicture() {
		return picture;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

//Konstruktoren
	public Product() {
		this("", "", 0.0F, new Picture(), "")
	}

	public Product(String productNumber, String name, float price, Picture picture, String description,
			Category... categories) {
		this.setProductNumber(productNumber);
		this.setName(name);
		this.setPrice(price);
		this.setPicture(picture);
		this.setDescription(description);
	
//Methoden
	
	/**
	 * Variante 1 um das Array in die Liste zu übertragen
	 */
//	this.setCategories(new ArrayList<>());
//
//	for (Category category : categories) {
//		this.getCategories().add(category);
//	}

	
	/**
	 * Variante 2 um das Array in die Liste zu übertragen
	 * 
	 * ACHTUNG - Dies erzeugt eine FAKE ArrayList
	 */
//	this.setCategories(Arrays.asList(categories));
	
	/**
	 * Variante 3 um das Array in die Liste zu übertragen
	 */
	this.setCategories(new ArrayList<Category>(Arrays.asList(categories)));
}

/**
 * @deprecated Please use Constructor with varArgs
 * 
 * @since v1
 * 
 * @param productNumber
 * @param name
 * @param price
 * @param picture
 * @param description
 * @param categories
 */
public Product(String productNumber, String name, float price, Picture picture, String description,
		List<Category> categories) {
	this.setProductNumber(productNumber);
	this.setName(name);
	this.setPrice(price);
	this.setPicture(picture);
	this.setDescription(description);
	this.setCategories(categories);
}

public boolean equals(Product other) {
	boolean ret01 = this.getProductNumber().equals(other.getProductNumber());
	boolean ret02 = this.getName().equals(other.getName());
	boolean ret03 = this.getPrice() == other.getPrice();
	boolean ret04 = this.getPicture().equals(other.getPicture());
	boolean ret05 = this.getDescription().equals(other.getDescription());
	boolean ret06 = this.getCategories().containsAll(other.getCategories());
	
	return ret01 && ret02 && ret03 && ret04 && ret05 && ret06;
}

@Override
public String toString() {
	return "Product [getProductNumber()=" + getProductNumber() + ", getName()=" + getName() + ", getPrice()="
			+ getPrice() + ", getPicture()=" + getPicture() + ", getDescription()=" + getDescription()
			+ ", getCategories()=" + getCategories() + "]";
}

public boolean addCategorie(Category category) {
	return this.getCategories().add(category);
}

public boolean removeCategory(Category category) {
	return this.getCategories().remove(category);
}

public boolean clearCategories() {
	this.getCategories().clear();
	//return this.getCategories().size() == 0;
	return this.getCategories().isEmpty();
}

}
