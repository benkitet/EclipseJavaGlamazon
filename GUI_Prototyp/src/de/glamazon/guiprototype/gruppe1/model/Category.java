package de.glamazon.guiprototype.gruppe1.model;

public class Category {
	private String name;
	private String description;
	
//getter/setter
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

//Konstruktoren
	public Category() {
		this("", "");
	}
	
	public Category(String name, String description) {
		this.setName(name);
		this.setDescription(description);
	}
	
// Methoden
	public boolean equals(Category other) {
		boolean r1 = this.getDescription().equals(other.getDescription());
		boolean r2 = this.getName().equals(other.getName());
		return r1 && r2;
	}
	
	@Override
	public String toString() {
		return "Category [getName()=" + getName() + ", getDescription()=" + getDescription() + "]";
	}
}
