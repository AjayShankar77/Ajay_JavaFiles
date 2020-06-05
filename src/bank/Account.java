package bank;
import java.util.Scanner;

public class Account {
	private String accNumber;
	private String customerName;
	private float balance;
	Scanner scanner;
	
	Account() {
		scanner = new Scanner(System.in);
	}
	
	Account(String accNumber, String customerName, float balance) {
		scanner = new Scanner(System.in);
		this.accNumber = accNumber;
		this.customerName = customerName;
		this.balance = balance;
	}
		
	public String getAccNumber() {
		return accNumber;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public float getBalance() {
		return balance;
	}
		
	void getCustomerDetails() {
		System.out.println("Enter the Account Number");
		accNumber = scanner.nextLine();
		System.out.println("Enter the Customer Name");
		customerName = scanner.nextLine();
	}
	
	void printCustomerDetails() {
		System.out.println("Account Number: "+accNumber+"\nCustomer Name: "+customerName);
		System.out.println("----------------------------------------");
	}

}
