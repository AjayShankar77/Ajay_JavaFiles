package javaDay20Practice;
import java.util.*;

public class Transport {
	
	ArrayList<Driver> drivers;
	ArrayList<Employee> employees;
	HashMap<String, Bus> buses;
	Scanner scanner;
	
	Transport() {
		scanner = new Scanner(System.in);
		drivers = new ArrayList<Driver>();
		employees = new ArrayList<Employee>();
		buses = new HashMap<String, Bus>();
	}
	
	void addDrivers() {
		String choice = "No";
		Driver driver;
		do {
			driver = new Driver();
			driver.getDriverDetails();
			drivers.add(driver);
			System.out.println("Do you wish to add another driver??");
			choice = scanner.nextLine();
			
		} while (choice.toUpperCase().equals("YES"));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
