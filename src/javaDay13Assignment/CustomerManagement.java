package javaDay13Assignment;

import java.util.*;

public class CustomerManagement {
	ArrayList<Customer> customers;
	Scanner scanner;
	
	CustomerManagement() {
		scanner  = new Scanner(System.in);
		customers = new ArrayList<Customer>();
	}
	
	public void addCustomer() {
		Customer customer = new Customer();
		customer.getCustomerDetails();
		customers.add(customer);
	}
	
	public void addCustomers() {
		String choice = "No";
		do {
			addCustomer();
			System.out.println("Do u want to add more Customers?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
		} while (!choice.toLowerCase().equals("no"));
		System.out.println("Customer details added");
		System.out.println("--------------------");
	}
	
	Customer findCustomerIndex(int id) {
		for (Customer customer : customers) {
			if(customer != null)
			{
				if(customer.getId()==id)
				{
					return customer;
				}
			}
		}
		return null;
	}
	
	public void compareCustomers() {
		int id1=0,id2=0;
		Customer c1,c2;
		System.out.println("Please enter the first Customer id to be compared");
		id1 = scanner.nextInt();
		c1 = findCustomerIndex(id1);
		if(c1==null)
		{
			System.out.println("No such Customer available.. Please try again from start");
			compareCustomers();
		}
		System.out.println("Please enter the second Customer id to be compared");
		id2 = scanner.nextInt();
		c2 = findCustomerIndex(id2);
		if(c2==null)
		{
			System.out.println("No such Customer available.. Please try again from start");
			compareCustomers();
		}
		if(c1.equals(c2))
			System.out.println("The Customer details are just the same");
		else
			System.out.println("Not same");
		System.out.println("--------------------");
	}
	
	public void deleteCustomer() {
		int id1=0;
		System.out.println("Please enter the Customer id to be deleted");
		id1 = scanner.nextInt();
		Customer c1 = findCustomerIndex(id1);
		if(c1==null)
		{
			System.out.println("No such Customer");
			System.out.println("No Customer details deleted");
		}
		else	
		{
			System.out.println("The Customer to be deleted is ");
			System.out.println(c1);
			customers.remove(c1);
			System.out.println("Customer details deleted from database");
			System.out.println("--------------------");
		}
			
	}
	public void printCustomer() {
		int id1=0;
		System.out.println("Please enter the Customer id to be printed");
		id1 = scanner.nextInt();
		Customer c1 = findCustomerIndex(id1);
		System.out.println("The selected Customer details");
		if(c1==null)
		{
			System.out.println("No such Customer");
		}
		else
			System.out.println(c1);
		System.out.println("--------------------");
	}
	
	public void printAllCustomers() {
		for (Customer customer : customers) {
			System.out.println(customer);
			System.out.println("-----------------------");
		}
	}
	public void updateCustomerDetails() {
		int id1=0;
		System.out.println("Please enter the Customer id to be updated");
		id1 = scanner.nextInt();
		Customer c1 = findCustomerIndex(id1);
		System.out.println("The Customer details for updation");
		if(c1==null)
		{
			System.out.println("No such Customer");
		}
		else
		{
			System.out.println(c1);
			System.out.println("--------------------------");
			System.out.println("Please enter the Customer age for updation");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Please enter the Customer phone for updation");
			String phoneNumber = scanner.nextLine();
			c1.setAge(age);
			c1.setPhoneNumber(phoneNumber);
			System.out.println("Update success");
			System.out.println("The updated Customer details");
			System.out.println(c1);
			System.out.println("---------------------------");
			
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
				addCustomer();				
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
