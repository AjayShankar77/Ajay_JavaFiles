package javaDay24Assessment;
import java.util.*;

public class Transaction {
	
	int transactNumber;
	Account fromAccount;
	Account toAccount;
	String type, status;
	double amount;
	ArrayList<Account> accountList;
	Scanner scanner;
	
	Transaction() {
		scanner = new Scanner(System.in);
		accountList = new ArrayList<Account>();
	}
	
	void addAccount() {
		String choice = "No";
		Account account;
		do {
			account = new Account();
			account.getAccountDetailsFromUser();
			accountList.add(account);
			System.out.println("Do you want to add another account ??");
			choice = scanner.nextLine();
		}while (choice.toUpperCase().equals("YES"));
	}
	
	@Override
	public String toString() {
		String transactionData = "\nTransaction Number: "+transactNumber+"\nFrom Account: "+fromAccount.getAccountNumber()+"\nTo Account: "+toAccount.getAccountNumber();
		return transactionData;
	}
	
	public void transact() {
		addAccount();
		int menu;
		System.out.println("Menu");
		System.out.println("1. Cash deposit");
		System.out.println("2. Online transfer");
		System.out.println("3. Exit");
		boolean quit = false;
		do {
			System.out.println("Select the transaction type: ");
			menu = scanner.nextInt();
			switch(menu) {
			case 1:
				cashDeposit();
				break;
			case 2:
				onlineTransfer();
				break;
			case 3:
				quit = true;
				System.out.println("Exited");
				break;
			}
		}while (!quit);
	}
		
	public double cashDeposit()	{	
		System.out.print("Enter amount to deposit:");
		amount = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter To Account Number to be deposit :");
		if ( amount < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		amount = fromAccount.getBalance() + amount;
		 System.out.println("Deposit status:");
			System.out.println("Your Money has been successfully depsited");
		return 0;

	}
		public double onlineTransfer()	{
			System.out.print("Enter amount to deposit:");
			amount = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Enter From Account Number :");
			fromAccount.getAccountNumber();
			System.out.println("Enter To Account Number :");
			toAccount.getAccountNumber();
			if (fromAccount.getBalance() < 0) {
				System.out.println("Invalid Amount");
				return 1;
			}
			amount = fromAccount.getBalance() + toAccount.getBalance();
			 System.out.println("Transfer status");
				System.out.println("Your Money has been successfully transferred");
			return 0;
	
	}

	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		transaction.transact();

	}

}
