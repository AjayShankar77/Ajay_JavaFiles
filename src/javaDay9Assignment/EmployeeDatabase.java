package javaDay9Assignment;
import java.util.Scanner;

public class EmployeeDatabase {
	Scanner scanner;
	int id, age;
	String name, phone;
	
	EmployeeDatabase() {
		scanner = new Scanner(System.in);
	}
	
	EmployeeDatabase(int id, String name, int age, String phone) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	void getEmployeeDetails() {
		System.out.println("Enter the Employee ID");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Employee Name");
		name = scanner.nextLine();
		System.out.println("Enter the Employee Age");
		age = scanner.nextInt();
		System.out.println("Enter the Employee Phone");
		phone = scanner.nextLine();
		scanner.nextLine();
	}
	
	void printEmployeeDetails() {
		System.out.println("Enter the Employee ID to display the Employee details");
		System.out.println("Employee ID: "+id+"\nEmployee Name: "+name+"\nEmployee Age: "+age+"\nEmployee Phone: "+phone);
	}

	public static void main(String[] args) {
		EmployeeDatabase employeeDatabase = new EmployeeDatabase();
		employeeDatabase.getEmployeeDetails();
		employeeDatabase.printEmployeeDetails();
	}

}
