package javaDay20Practice;
import java.util.*;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name, phone, busId;
	private Scanner scanner;
	private Bus bus;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String phone) {
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
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	public void getEmployeeDetails() {
		scanner = new Scanner(System.in);
		System.out.println("Enter the Employee ID: ");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Employee Name: ");
		name = scanner.nextLine();
		System.out.println("Enter the Employee phone: ");
		phone = scanner.nextLine();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee1 = this;
		Employee employee2 = (Employee)obj;
		if(employee1.id == employee2.id)
			return true;
		else
			return false;
	}
	
	public void assignBus(Bus bus) {
		try {
			this.bus = bus;
			this.busId = bus.getBusNumber();
		}
		catch(NullPointerException e) {
			System.out.println("Bus not assigned");
		}
	}
	
	@Override
	public String toString() {
		String employeeData  = "Employee ID: \n\r"+id+"Employee Name: \n\r"+name+"Employee Phone: "+phone;
		employeeData += "\n\r Bus Details: \n\r"+bus;
		return employeeData;
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.getName());
	}

}
