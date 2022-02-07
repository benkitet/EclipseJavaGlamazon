package de.glamazon.guiprototype.gruppe1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public final class ShoppingCart {

	// Eager - Eifrig - sobald die Klasse geladen wird, wird eine Instanz erzeugt.
	private final static ShoppingCart instance = new ShoppingCart();

	// Lazy - wartend - Die instanze wird zu einem Späteren zeitpunkt erzeugt.
	// private static ShoppingCart instance;

	private List<Product> products;

	// Eager - getInstance
	public static ShoppingCart getInstance() {
		return instance;
	}

	// Lazy - wartend
//	public static ShoppingCart getInstance() {
//		if (ShoppingCart.instance == null) {
//			ShoppingCart.instance = new ShoppingCart();
//		}
//		return instance;
//	}

	public List<Product> getProducts() {
		return products;
	}

	private void setProducts(List<Product> products) {
		this.products = products;
	}

	private ShoppingCart() {
		this.setProducts(new ArrayList<Product>());
	}

	public boolean equals(ShoppingCart other) {
		/**
		 * Da als Singleton realisiert, sollte es keine weiteren Instanzen geben. Sollte
		 * also "this" und "other" nicht dieselben Instanzen sein --- false
		 */
		return this == other;
	}

	@Override
	public String toString() {
		return "ShoppingCart [getProducts()=" + getProducts() + "]";
	}

	public boolean addProduct(Product product) {
		return this.getProducts().add(product);
	}

	public boolean removeProduct(Product product) {
		return this.getProducts().remove(product);
	}

	public boolean clearShoppingCart() {
		this.getProducts().clear();
		return this.getProducts().isEmpty();
	}

	public boolean printShoppingCart() {

		Consumer<Product> consumer = (p) -> {
			System.out.print(p.getName());
			System.out.print("\n\t" + p.getPrice());
			System.out.println("\n\t" + p.getDescription());
		};
		this.getProducts().forEach(consumer);

		return !this.getProducts().isEmpty();
	}
}
