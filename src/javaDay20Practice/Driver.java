package javaDay20Practice;

import java.util.Scanner;

public class Driver {
	
	private int id;
	private String name,phone;
	private boolean isAllocated;
	private Scanner scanner;
	
	public Driver() {
		
	}
	
	public Driver(int id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isAllocated() {
		return isAllocated;
	}

	public void setAllocated(boolean isAllocated) {
		this.isAllocated = isAllocated;
	}
	
	public void getDriverDetails() {
		scanner = new Scanner(System.in);
		System.out.println("Enter the Driver id: ");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Driver name: ");
		name = scanner.nextLine();
		System.out.println("Enter the Driver phone: ");
		phone = scanner.nextLine();
	}
	
	@Override
	public String toString() {
		String data = "Driver ID: "+id+"/nDriver Name: "+name+"\nDriver Phone: "+phone;
		return data;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		Driver driver1 = this;
		try {
			Driver driver2 = (Driver)obj;
			if(driver1.id == driver2.id)
				result = true;
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

}
