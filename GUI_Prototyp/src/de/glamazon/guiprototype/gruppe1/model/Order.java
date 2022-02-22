package de.glamazon.guiprototype.gruppe1.model;

public class Order {
	private Customer customer;
	private ShoppingCart shoppingCart;
	
//getter/setter
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
//Konstruktoren
	public Order() {
		
	}
	
}
