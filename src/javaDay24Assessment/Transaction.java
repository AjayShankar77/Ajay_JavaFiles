package javaDay24Assessment;
import java.util.Scanner;

public class Transaction {
	
	int transactNumber;
	Account fromAccount, toAccount;
	String type, status;
	double balance, amount;
	Scanner scanner;
	
	Transaction() {
		
	}
	
	@Override
	public String toString() {
		String transactionData = "Transaction Number: \n\r"+transactNumber+"From Account: \n\r"+fromAccount+"To Account: "+toAccount;
		return transactionData;
	}
	
	public void transact() {
		scanner = new Scanner(System.in);
		System.out.println("Enter the Account Number");
		transactNumber = scanner.nextInt();
		scanner.nextLine();
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
		balance = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter To Account Number to be deposit :");
		toAccount.getAccountNumber();
		if (balance < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		balance = balance + amount;
		 System.out.println("deposit status");
			System.out.println("Your Money has been successfully depsited");
		return 0;

	}
		public double onlineTransfer()	{
			System.out.print("Enter amount to deposit:");
			balance = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter From Account Number :");
			fromAccount.getAccountNumber();
			System.out.println("Enter To Account Number :");
			toAccount.getAccountNumber();
			if (balance < 0) {
				System.out.println("Invalid Amount");
				return 1;
			}
			balance = balance + amount;
			 System.out.println("deposit status");
				System.out.println("Your Money has been successfully depsited");
			return 0;
	
	}

	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		transaction.transact();

	}

}
