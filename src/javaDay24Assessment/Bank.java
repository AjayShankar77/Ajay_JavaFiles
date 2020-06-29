package javaDay24Assessment;
import java.util.*;

public class Bank {
	ArrayList<Account> accounts;
	ArrayList<Transaction> transactions;
	Scanner scanner;
	
	Bank() {
		scanner = new Scanner(System.in);
		accounts = new ArrayList<Account>();
		transactions = new ArrayList<Transaction>();
	}
	
	void addAccounts() {
		String choice = "No";
		Account account;
		do {
			account = new Account();
			account.getAccountDetailsFromUser();
			accounts.add(account);
			System.out.println("Do you want to add another account??");
			choice = scanner.nextLine();
		}while(choice.toUpperCase().equals("YES"));
	}
	
	void addTransactions() {
		String choice = "No";
		Transaction transaction;
		do {
			transaction = new Transaction();
			transaction.transact();
			transactions.add(transaction);
			System.out.println("Do you want to do another transactions??");
			choice = scanner.nextLine();
		}while(choice.toUpperCase().equals("YES"));
	}
	
	void printAccounts() {
		for(Account account : accounts) {
			System.out.println(account);
		}
	}
	
	void printTransaction() {
		for(Transaction transaction : transactions) {
			System.out.println(transaction);
		}
	}
	
	void printMenu() {
		addAccounts();
		addTransactions();
		printAccounts();
		printTransaction();
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.printMenu();

	}

}
