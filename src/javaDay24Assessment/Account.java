package javaDay24Assessment;
import java.util.*;
import java.io.Console;

public class Account implements Comparable<Account> {
	
	private String accountNumber;
	private String customerName;
	private String password;
	private String phone;
	private double balance;
	Scanner scanner;
	Console console = System.console();
	
	Account() {
		
	}
		
	Account(String accountNumber, String customerName, String phone, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.phone = phone;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		String data = "Account Number: \n\r"+accountNumber.replaceAll("\\d(?=\\d{2})", "*")+"Password: "+password.replaceAll("^[a-zA-Z0-9_]$", "****")+"Customer Name: \n\r"+customerName+"Phone Number: "+phone;
		return data;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account account1 = this;
		Account account2 = (Account)obj;
		if(account1.accountNumber.equals(account2.accountNumber))
			return true;
		else
			return false;
	}
	
	@Override
	public int compareTo(Account o) {
		return this.accountNumber.compareTo(o.getAccountNumber());
	}
	
	public void getAccountDetailsFromUser() {
		scanner = new Scanner(System.in);
		System.out.println("Enter the Account Number");
		accountNumber = scanner.nextLine();
		System.out.println("Enter the password");
		password = scanner.nextLine();
		System.out.println("Enter the Customer Name");
		customerName = scanner.nextLine();
		System.out.println("Enter the Customer Phone");
		phone = scanner.nextLine();
		System.out.println("Enter the balance");
		balance = scanner.nextDouble();
		
	}
	
	public static void main(String[] args) {
		
		Account account = new Account();
		account.getAccountDetailsFromUser();

	}

	

}
