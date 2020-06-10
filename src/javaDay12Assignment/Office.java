package javaDay12Assignment;

interface customerManager {
	void solveIssues();
	void approveLoan();
}

interface employeeManager {
	void conductMeeting();
	void setTarget();
}

abstract class Employee {
	protected int id;
	protected String name, phone, designation;
	
	abstract void assignDesignation();
}

class Manager extends Employee implements customerManager, employeeManager {

	@Override
	public void conductMeeting() {
		System.out.println("\nEmployee Manager conducts weekly and monthly meetings");
		
	}

	@Override
	public void setTarget() {
		System.out.println("\nEmployee Manager sets target for employees");
		
	}

	@Override
	public void solveIssues() {
		System.out.println("\nCustomer Manager solves the Customer related issues");
		
	}

	@Override
	public void approveLoan() {
		System.out.println("\nCustomer Manager approve the Customer loans");
		
	}

	@Override
	void assignDesignation() {
		System.out.println("\nEvery employee has the designation");
		
	}
	
}

public class Office {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.assignDesignation();
		customerManager cm;
		cm = manager;
		cm.solveIssues();
		cm.approveLoan();
		employeeManager em;
		em = manager;
		em.conductMeeting();
		em.setTarget();
	}

}
