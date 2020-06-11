package javaDay13Assignment;
import java.util.*;

public class Accounts {
	
	ArrayList<String> myArray;
	
	Accounts() {
		myArray = new ArrayList<String>();
	}
	//Account mode class should have account_number,name,phone and balance
	void addAccounts() {
		myArray.add("Customer Name: Ajay");
		myArray.add("Acc#: 52323626236");
		myArray.add("Phone: 98523523525");
		myArray.add("Balance: $10,000,000");
	}
	
	void printAccounts() {
		for (String string : myArray) {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		Accounts accounts = new Accounts();
		accounts.addAccounts();
		accounts.printAccounts();
	}

}
