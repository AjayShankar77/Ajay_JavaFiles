package javaDay15Assignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.io.*;

public class Transactions {
	ArrayList<Account> accountDetails;
	Scanner scanner;
	double amount;
	
	Transactions(){
		scanner = new Scanner(System.in);
		accountDetails = new ArrayList<Account>();
	}
	
	void userOperation() {
	int userChoice = 0;
	String transOption=null, addChoice=null;
	do {
		System.out.println("Please select the banking operation you want \r\n" + 
					"1) Transaction \r\n" + 
					"2) Print Account Details \r\n" + 
					"3) Show Balance");
		
		userChoice = scanner.nextInt();
		scanner.nextLine();
		try {
		if(userChoice==1) {
				System.out.println("Please enter the Transaction type: \r\n" + 
						"1) Withdraw \r\n" + 
						"2) Deposit");
				transOption =scanner.next();
				scanner.nextLine();
		}
		}
		catch(Exception e) {
			System.out.println("Invalid entry");
			
		}
		System.out.println("Please enter the Account number");
		int accNo=scanner.nextInt();
		scanner.nextLine();
		Account accObject = findAccount(accNo);
		if(accObject!= null) {
			switch(userChoice) {
				case 1: System.out.println("Please enter the amount to transfer");
						amount=scanner.nextDouble();
						scanner.nextLine();
						if(accObject.getAccType().equalsIgnoreCase("savings"))
						{
							new SavingsAccount().transact(accObject, transOption, amount);
						}
						else if(accObject.getAccType().equalsIgnoreCase("current"))
						{
							new CurrentAccount().transact(accObject, transOption, amount);
						}
						break;
				case 2: 
						System.out.println(accObject.getAccType()+
						"\r\nAccount Number : "+accNo+
						"\r\nName : "+accObject.getName()+
						"\r\nAge : " +accObject.getAge()+ 
						"\r\nPhone : "+accObject.getPhone()+
						"\r\nBalance : "+accObject.getBalance());
						break;
				case 3 : 
						System.out.println("The available balance is "+accObject.checkBalance());	
						break;
				/*case 4 :
				try {
					saveFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
						break;*/
			}
			System.out.println("Do u want to do another operation??...yes/no");
			 addChoice = scanner.nextLine();
		}
	}while( addChoice.equalsIgnoreCase("yes"));
}

int ageCalculation (String dob) {
	int age = 0;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.parse(dob, formatter);
	  LocalDate now = LocalDate.now();
	  Period diff = Period.between(localDate, now);
	  age = diff.getYears();
	 return age;
}

	void populateAccounts(int accountNumber, String accType, String name, String dob, String phone, double balance, int age)
	{
		Account accObject = new SavingsAccount();
		accObject.setAccountNumber(accountNumber);
		accObject.setAccType(accType);
		accObject.setBalance(balance);
		accObject.setName(name);
		accObject.setDob(dob);
		accObject.setAge(age);
		accObject.setPhone(phone);
		accountDetails.add(accObject);
	}
	
	Account findAccount(int accNo) {
		for(Account accObject:accountDetails){
			if(accObject.getAccountNumber() == accNo)
				return accObject;
		}
		System.out.println("Account does not exist");
		return null;
	}
	
	/*void saveFile() throws IOException {
		JFileChooser fileChooser = new JFileChooser();
		Component modalToComponent = null;		
		if (fileChooser.showSaveDialog(modalToComponent) == JFileChooser.APPROVE_OPTION) {
		  File file = fileChooser.getSelectedFile();
		  file.createNewFile();
		  PrintStream printStream = new PrintStream(new FileOutputStream(file));
		  System.setOut(printStream);

		}
	}*/
	public static void main(String[] a) throws IOException {
		Account sObj = new SavingsAccount();
		sObj.takeAccountDetails();
	}
}
