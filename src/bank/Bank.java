package bank;
import java.util.Scanner;

public class Bank {

	Account[] account;
	Scanner scanner;
	
	Bank() {
		account = new Account[5];
	}
	
	void createAccount() {
		for (int i = 0; i < account.length; i++) {
			account[i] = new Account();
			account[i].getCustomerDetails();
		}
	}
	
	void listCustomerDetails() {
		for (int i = 0; i < account.length; i++) {
			account[i].printCustomerDetails();
		}
	}
	
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.createAccount();
		bank.listCustomerDetails();

	}

}
