package databasedemo;

import java.util.ArrayList;

import com.google.gson.Gson;

import models.Category;
import models.Employee;
import models.Product;
import services.CategoryService;
import services.EmployeeService;
import services.ProductService;
import util.Configuration;

public class DatabaseDemo {
//main Klasse
	public static void main(String[] args) {
	
	// ORMapping
	// Services

    Configuration config = Configuration.getInstance();
    config.setVersion(0.2);
	System.out.println(config);
		
		

		
		// Login Passwortabfrage
//	EmployeeService es = new EmployeeService();
////	Employee emp = es.addEmployee(new Employee(0, "SichereGabi", "Nimbus2001"));
////	System.out.println(emp);
//	System.out.println("--------------------------");
//	ArrayList<Employee> employees = es.getEmployees();
//
//	for(Employee e : employees) {
//		System.out.println(e);
//		}
//	}
//		
		// Employee Abfrage
//	EmployeeService es = new EmployeeService();
//	Employee emp = es.addEmployee(new Employee(0, "SichereGabi", "Nimbus2001"));
//	System.out.println(emp);
//	System.out.println("--------------------------");
//	ArrayList<Employee> employees = es.getEmployees();
//
//	for(Employee e : employees) {
//		System.out.println(e);
//		}
//	}
		// Category Abfrage
//	CategoryService cs = new CategoryService();
//	Category cat = cs.addCategory(new Category(0, "Elektronik", "Laptops und Uhren"));
//	System.out.println(cat);
//	System.out.println("--------------------------");
//	ArrayList<Category> categories = cs.getCategory();
//
//	for(Category c : categories) {
//		System.out.println(c);
//		}
//		
//	}
		// Product Abfrage
//	ProductService ps = new ProductService();
//	Product pro = ps.addProduct(new Product(0, "Smartwatch", "tolle smarte Uhr", 200, "Bild1"));
//	System.out.println(pro);
//	System.out.println("--------------------------");
//	ArrayList<Product> products = ps.getProducts();
//
//		for(Product p : products) {
//			System.out.println(p);
//			}
	}		
}