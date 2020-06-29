package javaDay20Practice;

import java.util.Scanner;

public class Bus {
	
	private String busNumber, startingPoint;
	private int busCapacity, filledStatus;
	private Driver driver;
	private Scanner scanner;
	
	public Bus() {
		
	}
	
	public Bus(String busNumber, String startingPoint, int busCapacity, int filledStatus, Driver driver) {
		this.busNumber = busNumber;
		this.startingPoint = startingPoint;
		this.busCapacity = busCapacity;
		this.filledStatus = filledStatus;
		this.driver = driver;
	}
	
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public int getBusCapacity() {
		return busCapacity;
	}
	public void setBusCapacity(int busCapacity) {
		this.busCapacity = busCapacity;
	}
	public int getFilledStatus() {
		return filledStatus;
	}
	public void setFilledStatus(int filledStatus) {
		this.filledStatus = filledStatus;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public void getBusDetails() {
		scanner = new Scanner(System.in);
		System.out.println("Enter the Bus Number: ");
		busNumber = scanner.nextLine();
		System.out.println("Enter the Starting Point: ");
		startingPoint = scanner.nextLine();
		System.out.println("Enter the Bus Capacity: ");
		busCapacity = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Bus Filled Status: ");
		filledStatus = scanner.nextInt();
		scanner.nextLine();
	}
	
	@Override
	public String toString() {
		String busData = "Bus Number: \n\r"+busNumber+"Starting Point: \n\r"+startingPoint+"Bus Capacity: \n\r"+busCapacity+"Filled Status: "+filledStatus;
		busData += "\n\rDriver Details: " + driver;
		return busData;
	}
	
	@Override
	public boolean equals(Object obj) {
		Bus bus1 = this;
		Bus bus2 = (Bus)obj;
		if(bus1.busNumber.equals(bus2.busNumber))
			return true;
		else
			return false;
	}

}
