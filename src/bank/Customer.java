package bank;
import java.util.Scanner;

public class Customer {
	
	private int id;
	private String customerName;
	private String phoneNumber;
	Account account;
	Scanner scanner;
	
	Customer() {
		scanner = new Scanner(System.in);
		account = null;
	}
	
	Customer(String customerName, String phoneNumber, String accNumber) {
		scanner = new Scanner(System.in);
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		System.out.println("Enter the name");
		customerName = scanner.nextLine();
		System.out.println("Enter the phone number");
		phoneNumber = scanner.nextLine();
	}
	
	

}
