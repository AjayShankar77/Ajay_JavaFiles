package javaDay13Assignment;

import java.util.Scanner;

public class Customer {
	Scanner scanner;
	private int id, age;
	private String customerName, phoneNumber;
	
	Customer() {
		scanner = new Scanner(System.in);
	}
	
	Customer(String customerName, int age, String phoneNumber) {
		scanner = new Scanner(System.in);
		this.customerName = customerName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	Customer(int id, String customerName, int age, String phoneNumber) {
		scanner = new Scanner(System.in);
		this.id = id;
		this.customerName = customerName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	void getCustomerDetails() {
		System.out.println("Enter the Customer ID");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Customer Name");
		customerName = scanner.nextLine();
		System.out.println("Enter the Customer Age");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Customer Phone Number");
		phoneNumber = scanner.nextLine();
	}
	
	@Override
	public String toString() {
		return "Customer ID: "+id+"\nCustomer Name: "+customerName+"\nAge: "+age+"\nPhone: "+phoneNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer c1 = this;
		Customer c2 = this;
		if(c1.getCustomerName().equals(c2.customerName) && c1.phoneNumber.equals(c2.phoneNumber))
			return true;
		else
			return false;
	}
}
