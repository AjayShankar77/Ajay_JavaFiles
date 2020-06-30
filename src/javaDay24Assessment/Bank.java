package javaDay24Assessment;
import java.util.*;

public class Bank {
	ArrayList<Account> accounts;
	ArrayList<Transaction> transactions;
	Scanner scanner;
	
	public Bank() {
		scanner = new Scanner(System.in);
		accounts = new ArrayList<Account>();
		transactions = new ArrayList<Transaction>();
	}
	
	public void addAccounts(Account account) {
		String choice = "No";
		do {
			account = new Account();
			account.getAccountDetailsFromUser();
			accounts.add(account);
			System.out.println("Do you want to add another account??");
			choice = scanner.nextLine();
		}while(choice.toUpperCase().equals("YES"));
	}
	
	public void addTransactions(Transaction transaction) {
		String choice = "No";
		do {
			transaction = new Transaction();
			transaction.transact();
			transactions.add(transaction);
			System.out.println("Do you want to do another transactions??");
			choice = scanner.nextLine();
		}while(choice.toUpperCase().equals("YES"));
	}
	
	public void printAccounts() {
		for(Account account : accounts) {
			System.out.println(account);
		}
	}
	
	public void printTransaction() {
		for(Transaction transaction : transactions) {
			System.out.println(transaction);
		}
	}
	
	public void doTransactions() {
		Transaction transaction = new Transaction();
		transaction.transact();
	}
	
	public void printMenu() {
		printAccounts();
		doTransactions();
		printAccounts();
		printTransaction();
		doTransactions();
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.printMenu();

	}

}
