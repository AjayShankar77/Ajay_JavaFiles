package javaDay11Assignment;
import java.util.Scanner;

public class CustomerManagement {
	Customer[] customers;
	Scanner scanner;
	int countOfCustomers;
	
	public CustomerManagement() {
		scanner = new Scanner(System.in);
		customers = new Customer[10];
	}
	
	public void addCustomer(int idx) {
		if(idx<10 ) {
			customers[idx] = new Customer();
			customers[idx].getCustomerDetails();
		}
		else
			System.out.println("Cannot add more Customers....No more memory in Database");
	}
	
	public void addCustomers() {
		int index = -1;
		String choice = "No";
		do {
			index++;
			addCustomer(index);
			System.out.println("Do u want to add more Customers?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
		} while (!choice.toLowerCase().equals("no") && index<10);
		countOfCustomers = index;
		System.out.println("Customer details added");
		System.out.println("--------------------");
	}
	
	int findCustomerIndex(int id)
	{
		int index = -1;
		for (int i = 0; i <= countOfCustomers; i++) {
			if(customers[i].getId()==id)
			{
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void compareCustomers() {
		int id1=0,id2=0,idx1,idx2;
		System.out.println("Please enter the first Customer id to be compared");
		id1 = scanner.nextInt();
		idx1 = findCustomerIndex(id1);
		if(idx1==-1)
		{
			System.out.println("No such Customer available.. Please try again from start");
			compareCustomers();
		}
		System.out.println("Please enter the second Customer id to be compared");
		id2 = scanner.nextInt();
		idx2 = findCustomerIndex(id2);
		if(idx2==-1)
		{
			System.out.println("No such Customer available.. Please try again from start");
			compareCustomers();
		}
		if(customers[idx1].equals(customers[idx2]))
			System.out.println("The Customer details are just the same");
		else
			System.out.println("Not same");
		System.out.println("--------------------");
	}
	
	public void deleteCustomer() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the Customer id to be deleted");
		id1 = scanner.nextInt();
		idx1 = findCustomerIndex(id1);
		if(idx1==-1)
		{
			System.out.println("No such Customer");
			System.out.println("No Customer details deleted");
		}
		else	
		{
			System.out.println("The Customer to be deleted is ");
			System.out.println(customers[idx1]);
			customers[idx1] = null;
			System.out.println("Customer details deleted from database");
			System.out.println("--------------------");
		}
			
	}
	public void printCustomer() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the Customer id to be printed");
		id1 = scanner.nextInt();
		idx1 = findCustomerIndex(id1);
		System.out.println("The selected Customer details");
		if(idx1==-1)
		{
			System.out.println("No such Customer");
		}
		else
			System.out.println(customers[idx1]);
		System.out.println("--------------------");
	}
	
	public void printAllCustomers() {
		for (int i = 0; i <= countOfCustomers; i++) {
			System.out.println(customers[i]);
			System.out.println("--------------------");
		}
	}
	public void updateCustomerDetails() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the Customer id to be updated");
		id1 = scanner.nextInt();
		idx1 = findCustomerIndex(id1);
		System.out.println("The Customer details for updation");
		if(idx1==-1)
		{
			System.out.println("No such Customer");
		}
		else
		{
			System.out.println(customers[idx1]);
			System.out.println("--------------------");
			System.out.println("Please enter the Customer age for updation");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Please enter the Customer phone for updation");
			String phoneNumber = scanner.nextLine();
			customers[idx1].setAge(age);
			customers[idx1].setPhoneNumber(phoneNumber);
			System.out.println("Update success");
			System.out.println("The updated Customer details");
			System.out.println(customers[idx1]);
			System.out.println("--------------------");
			
		}
	}
	void printMenu() {
		int userChoice = 0;
		do {
			System.out.println("--------------------");
			System.out.println("1. Adding a new Customer");
			System.out.println("2. Updating the Customer details");
			System.out.println("3. Deleting a Customer");
			System.out.println("4. Printing all the Customer details");
			System.out.println("5. Printing the given Customer detail");
			System.out.println("6. Compare Customers");
			System.out.println("7. Exit");
			System.out.println("--------------------");
			userChoice  = scanner.nextInt();
			switch (userChoice ) {
			case 1:
				countOfCustomers++;
				addCustomer(countOfCustomers);				
				break;
			case 2:
				updateCustomerDetails();
				break;
			case 3:
				deleteCustomer();
				break;
			case 4:
				printAllCustomers();
				break;
			case 5:
				printCustomer();
				break;
			case 6:
				compareCustomers();
				break;
			case 7:
				System.out.println("exiting.....");
				break;
			default:
				System.out.println("Invalid option.. Try again");
				break;
			}
			
		} while (userChoice!=7);
		
	}	

	public static void main(String[] args) {
		CustomerManagement customerManagement = new CustomerManagement();
		customerManagement.addCustomers();
		customerManagement.printMenu();

	}

}
