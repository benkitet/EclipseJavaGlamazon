package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Category;

public final class CategoryService extends Services{

public Category addCategory(Category cat ) {
	Category insertedCat = new Category();
	
	try {
		if(super.dbm.insert(
				"Category",
				new String[] {"category", "description"},
				new String[] {cat.getCategory(), cat.getDescription()}
	)) {
		insertedCat = this.getCategoryByName(cat.getCategory());
		}
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	return insertedCat;
}

public boolean updateCategory(String categoryID, String [] values) throws SQLException {
	return super.dbm.update(
			"Category", 
			new String[] {"category", "description"},
			values,
			new String[] {"categoryID", "=", categoryID}
			);
}
	
public boolean deleteCategory(String categoryID) throws SQLException {
	return super.dbm.delete(
			"Category", 
			new String[] {"categoryID", "=", categoryID}
			);
}	

public ArrayList<Category> getCategory() {
	ArrayList<Category> categories = new ArrayList<Category>();
	
	try {
		ResultSet rs = super.dbm.select(
				"Category",
				new String[] {"categoryID", "category", "description"}, 
				null
		);
		
		if(!rs.next()) {
		} else {
			do {
				categories.add(new Category(rs.getInt("categoryID"), rs.getString("category"), rs.getString("description")));
			} while (rs.next());
		}
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	return categories;
}

public ResultSet getCategoryById(int categoryID) throws SQLException {
	return super.dbm.select(
			"Category",
			new String[] {"categoryID", "category", "description"},
			new String[] {"categoryID", "=", "" + categoryID}
			);
}

public Category getCategoryByName(String name) {
	Category cat = new Category();
	
	try {
		ResultSet rs = super.dbm.select(
				"Category",
				new String[] {"CategoryID", "category", "description"},
				new String[] {"category", "=", name}
		);
		if(!rs.next()) {
		} else {
			do {
				cat = new Category(rs.getInt("categoryID"), rs.getString("category"), rs.getString("description"));
			} while(rs.next());
		}
	} catch(SQLException e) {
		System.out.println(e.getMessage());
	}
	
	return cat;
}
}