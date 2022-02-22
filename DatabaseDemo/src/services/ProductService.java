package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Employee;
import models.Product;

public final class ProductService extends Services {

	public Product addProduct(Product pro) {
		Product insertedPro = new Product();
		
		try {
			if(super.dbm.insert(
					"Product",
					new String[] {"productName", "description", "picture"},
// Was mache ich mit int price??
					new String[] {pro.getProductName(), pro.getDescription(), pro.getPicture()}
					)) {
				insertedPro = this.getProductByName(pro.getProductName());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return insertedPro;
	}
	
public boolean updateProduct(String productItemID, String [] values) throws SQLException {
	return super.dbm.update(
			"Product",
			new String[] {"productName", "description", "price", "picture"},
			values,
			new String [] {"productItemID", "=", productItemID}
			);
}
public boolean deleteProduct(String productItemID) throws SQLException {
	return super.dbm.delete(
			"Product", 
			new String[] {"productItemID", "=", productItemID}
	);
}
public ArrayList<Product> getProducts() {
	ArrayList<Product> products = new ArrayList<Product>();
	
	try {
		ResultSet rs = super.dbm.select(
				"Product",
				new String[] {"productItemID", "productName", "description", "price", "picture"}, 
				null
		);
		
		if(!rs.next()) {
		} else {
			do {
				products.add(new Product(rs.getInt("productItemID"), rs.getString("productName"), rs.getString("description"), rs.getInt("price"), rs.getString("picture")));
			} while(rs.next());
		}
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	
	return products;
}

public ResultSet getProductById(int productItemID) throws SQLException {
	return super.dbm.select(
			"Product",
			new String[] {"productItemID", "productName", "description", "price", "picture"},
			new String[] {"productItemID", "=", "" +productItemID} 
	);
}
// folgendes noch bearbeiten:
public Product getProductByName(String name) {
	Product pro = new Product();
	
	try {
		ResultSet rs = super.dbm.select(
				"Product",
				new String[] {"productItemID", "productName", "description", "price", "picture"},
				new String[] {"productName", "=", name} 
		);
		
		if(!rs.next()) {
		} else {
			do {
				pro = new Product(rs.getInt("productItemID"), rs.getString("productName"), rs.getString("description"), rs.getInt("price"), rs.getString("picture"));
			} while(rs.next());
		}
	} catch(SQLException e) {
		System.out.println(e.getMessage());
	}
	
	return pro;
}
}