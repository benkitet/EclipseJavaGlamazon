package de.glamazon.guiprototype.gruppe1.model;

import java.util.Arrays;

public class Employee extends Customer {
	private String username;
	private char[] password;
	
//getter/setter	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}
	
//Standardkonstruktor
	public Employee() {
		this("", "totalsicherespassword".toCharArray());
	}
	
//Konstruktor mit Parametern
	public Employee(String username, char[] password) {
		this.setUsername (username);
		this.setPassword (password);
	}

//Methoden
	public boolean equals(Employee other) {
		boolean ret01 = super.equals(other);
		boolean ret02 = this.getUsername().equals(other.getUsername());
		
		/**
		 * Achtung ein Array selbst ist ein Object, die Elemente in einem Array können
		 * auch Primitive datentypen sein. Bitte nicht direkt per Equals prüfen.
		 */
		/**
		 * Variante I
		 */
		boolean ret03 = false;
		if (this.getPassword().length == other.getPassword().length) {
			for (int i = 0; i < this.getPassword().length; i++) {
				ret03 = this.getPassword()[i] == other.getPassword()[i];
				/**
				 * Um die Schleife eventuell früher beenden zu können. Sollte nachdem prüfen das
				 * ergebnis false sein, dann sind die Passwörter inhaltlich nicht identisch
				 */
				if (ret03 == false) {
					break;
				}
			}
		}
		
		/**
		 * Variante II
		 */
//		boolean ret03 = true;
//		if (this.getPassword().length == other.getPassword().length) {
//			for (int i = 0; ret03 && i < this.getPassword().length; i++) {
//				ret03 = this.getPassword()[i] == other.getPassword()[i];
//			}
//		}
		return ret01 && ret02 && ret03;
	}
	
	@Override
	public String toString() {
		return "Employee [getUsername=" + getUsername() + ", getPassword()=" + Arrays.toString(getPassword()) + "]";
	}
	
	
}
