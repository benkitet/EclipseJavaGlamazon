package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Employee;

public final class EmployeeService extends Services {
	
//	public boolean addEmployee(String username, String password) throws SQLException {
//		return super.dbm.insert(
//				"Employee", 
//				new String[] {"username", "password"}, 
//				new String[] {username, password}
//		);
//	}
	
	public Employee addEmployee(Employee emp) {
		Employee insertedEmp = new Employee();
		
		try {
			if(super.dbm.insert(
					"Employee", 
					new String[] {"username", "password"}, 
					new String[] {emp.getUsername(), emp.getPassword()}
			)) {
				insertedEmp = this.getEmployeeByName(emp.getUsername());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return insertedEmp;
	}
	
	public boolean updateEmployee(String id, String[] values) throws SQLException {
		return super.dbm.update(
				"Employee", 
				new String[] {"username", "password"}, 
				values,
				new String[] {"id", "=", id}
		);
	}
	
	
	public boolean deleteEmployee(String id) throws SQLException {
		return super.dbm.delete(
				"Employee", 
				new String[] {"id", "=", id}
		);
	}
	
	public ArrayList<Employee> getEmployees() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		try {
			ResultSet rs = super.dbm.select(
					"Employee",
					new String[] {"id", "username", "password"}, 
					null
			);
			
			if(!rs.next()) {
			} else {
				do {
					employees.add(new Employee(rs.getInt("id"), rs.getString("username"), rs.getString("password")));
				} while(rs.next());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return employees;
	}
	
	public ResultSet getEmployeeById(int id) throws SQLException {
		return super.dbm.select(
				"Employee",
				new String[] {"id", "username", "password"},
				new String[] {"id", "=", ""+id} 
		);
	}
	
	public Employee getEmployeeByName(String name) {
		Employee emp = new Employee();
		
		try {
			ResultSet rs = super.dbm.select(
					"Employee",
					new String[] {"id", "username", "password"},
					new String[] {"username", "=", name} 
			);
			
			if(!rs.next()) {
			} else {
				do {
					emp = new Employee(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
				} while(rs.next());
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return emp;
	}
}
