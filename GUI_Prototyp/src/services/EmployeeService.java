package services;

import de.glamazon.guiprototype.gruppe1.util.DatabaseManager;

public final class EmployeeService {
	public static boolean addEmployee(String username, String password) {
		DatabaseManager dbm = DatabaseManager.getInstance();
		dbm.insert(
				"Employee",  
				new String[] {"username", "password"},
				new String[] {username, password}
		);
		
		
	}
}
