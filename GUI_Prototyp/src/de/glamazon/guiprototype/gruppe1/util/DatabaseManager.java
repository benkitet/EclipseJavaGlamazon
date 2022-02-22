package de.glamazon.guiprototype.gruppe1.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public final class DatabaseManager {
	private static DatabaseManager instance = null;
	private static Connection connection = null;

	private DatabaseManager() {
		System.out.println("Konstruktor DatabaseManager gestartet");
	}
	
	public static DatabaseManager getInstance() {
		System.out.println("DatabaseManager getInstance gestartet");
		if(DatabaseManager.instance == null) {
			DatabaseManager.instance = new DatabaseManager();
		}
		return DatabaseManager.instance;
	}
		
	public void connect(String glamazondb) {
		if(DatabaseManager.connection == null) {
			try {
				Class.forName("org.sqlite.JDBC");
				DatabaseManager.connection = DriverManager.getConnection("jdbc:sqlite:glamazon.sqlite");
				if(connection != null)
					System.out.println("Verbindung zur Datenbank aufgebaut!");
				DatabaseManager.connection.setAutoCommit(false);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public boolean isConnected() {
		return DatabaseManager.connection != null;
		}
			
	public void disconnect() {
		try {
			if(DatabaseManager.connection != null) {
				DatabaseManager.connection.close();
				DatabaseManager.connection = null;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public ResultSet select(String table, String[] fields, String[] where) {
		String sql = "SELECT ";
		for(String field : fields) {
			sql += field + ", ";
		}
		sql = sql.substring(0, sql.length()-2);
		sql += " FROM " + table;
		
		if(where != null && where.length == 3) {
			sql += " WHERE " + where[0] + " " + where[1] + " ?";
		}
	// UPDATE 'table' SET 'username' = 'Klaus'
	
	try {
		PreparedStatement pstmt = DatabaseManager.connection.prepareStatement(sql);
		if(where != null && where.length == 3) {
			pstmt.setString(1, where[2]);
		}
		return pstmt.executeQuery();
	} catch (SQLException ex) {
		ex.printStackTrace();
		return null;
	}
}
	
	 public boolean insert(String table, String[] fields, String[] values) {
	    	String sql = "INSERT INTO " + table + " (";
	    	for(String field : fields) {
	    		sql += field + ", ";
	    	}
	    	sql = sql.substring(0, sql.length()-2) + ") VALUES (";
	    	
	    	for(int i = 0; i < fields.length; i++) {
	    		sql += "?, ";
	    	}
	    	sql = sql.substring(0, sql.length()-2) + ")";
	    	
			try {
				PreparedStatement pstmt = DatabaseManager.connection.prepareStatement(sql);
		    	for(int i = 1; i <= values.length; i++) {
		    		pstmt.setString(i, values[i-1]);
		    	}
				if(pstmt.executeUpdate() > 0) {
					DatabaseManager.connection.commit();
					return true;
				} else {
					return false;
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
				return false;
			}
	    }
	 public boolean update(String table, String[] fields, String[] values, String[] where) {
	    	String sql = "UPDATE " + table + " SET ";
	    	for(String field : fields) {
	    		sql += field + " = ?, ";
	    	}
	    	sql = sql.substring(0, sql.length()-2);
	    	
	    	if(where != null && where.length == 3) {
	    		sql += " WHERE " + where[0] + " " + where[1] + " ?";
	    	}
	    	
			try {
				PreparedStatement pstmt = DatabaseManager.connection.prepareStatement(sql);
		    	for(int i = 1; i <= values.length; i++) {
		    		pstmt.setString(i, values[i-1]);
		    	}
				if(where != null && where.length == 3) {
					pstmt.setString(values.length+1, where[2]);
				}
				if(pstmt.executeUpdate() > 0) {
					DatabaseManager.connection.commit();
					return true;
				} else {
					return false;
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
				return false;
			}
	    }
	    
	    public boolean delete(String table, String[] where) {
	    	String sql = "DELETE FROM " + table + " ";
	    	if(where != null && where.length == 3) {
	    		sql += " WHERE " + where[0] + " " + where[1] + " ?";
	    	}
	    	
			try {
				PreparedStatement pstmt = DatabaseManager.connection.prepareStatement(sql);
				if(where != null && where.length == 3) {
					pstmt.setString(1, where[2]);
				}
				if(pstmt.executeUpdate() > 0) {
					DatabaseManager.connection.commit();
					return true;
				} else {
					return false;
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
				return false;
			}
	    }
	    
	}
