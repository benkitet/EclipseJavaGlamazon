package de.glamazon.guiprototype.gruppe1.model;

public class Customer {
	private String lastname;
	private String firstname;
	private Address address;
	private Phone phone;
	private BankAccount bankAccount;
	
//getter/setter
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
//Konstruktoren
	public Customer() {
		this("", "", new Address(), new Phone(), new BankAccount());
	}
	public Customer(String lastname, String firstname, Address address, Phone phone, BankAccount bankAccount) {
		this.setLastname(lastname);
		this.setFirstname(firstname);
		this.setAddress(address);
		this.setPhone(phone);
		this.setBankAccount(bankAccount);
	}
	
	public boolean equals(Customer other) {
		boolean ret01 = this.getLastname().equals(other.getLastname());
		boolean ret02 = this.getFirstname().equals(other.getFirstname());
		boolean ret03 = this.getAddress().equals(other.getAddress());
		boolean ret04 = this.getPhone().equals(other.getPhone());
		boolean ret05 = this.getBankAccount().equals(other.getBankAccount());
		
		return ret01 && ret02 && ret03 && ret04 && ret05;
	}
	@Override
	public String toString() {
		return "Customer [getLastname()=" + getLastname() + ", getFirstname()=" + getFirstname() + ", getAddress()="
				+ getAddress() + ", getPhone()=" + getPhone() + ", getBankAccount()=" + getBankAccount() + "]";
	}
	
}
