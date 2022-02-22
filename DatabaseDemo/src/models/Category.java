package models;

public class Category {
	private int categoryID;
	private String category;
	private String description;
	private int productItemID;

// getter/setter
	public int getCategoryID() {
		return this.categoryID;
	}

	private void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategory() {
		return this.category;
	}

	private void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return this.description;
	}

	private void setDescription(String description) {
		this.description = description;
	}
	
	public int getProductItemID() {
		return this.productItemID;
	}

	private void setProductItemID(int productItemID) {
		this.productItemID = productItemID;
	}
	
//Konstruktoren
	public Category(int CategoryID, String category, String description) {
		this.setCategoryID(categoryID);
		this.setCategory(category);
		this.setDescription(description);
//		this.setProductItemID(productItemID);
	}
	
	public Category() {
		this(0, "", "");
	}
	
//alles wird in einen String geschrieben
	@Override
	public String toString() {
		return "CategoryID: " + this.getCategoryID() + 
			   ", Description: " + this.getDescription()+ 
			   ", Category: " + this.getCategory() +
			   ", ProductItemID: " + this.getProductItemID() ;
	}
	
}
