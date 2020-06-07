package javaDay9Assignment;
import java.util.Scanner;

public class ArithmeticOperation {
	Scanner scanner;
	int num1, num2;
	
	ArithmeticOperation() {
		scanner = new Scanner(System.in);
	}
	
	void getNumbersFromUser() {
		System.out.println("Enter the First Number");
		num1 = scanner.nextInt();
		System.out.println("Enter the Second Number");
		num2 = scanner.nextInt();
	}
	
	void performArithmeticOperation() {
		System.out.println("Please tell me what Arithmetic operation you want to do");
		System.out.println("Choose 1 for Addition");
		System.out.println("Choose 2 for Subtraction");
		System.out.println("Choose 3 for Multiplication");
		System.out.println("Choose 4 for Division");
		System.out.println("Choose 5 for Exit");
		int n = scanner.nextInt();
		switch(n) {
		
		case 1:
			int addition;
			addition = num1+num2;
			System.out.println("Added value is: "+addition);
			performArithmeticOperation();
			break;
			
		case 2:
			int subtraction;
			subtraction = num1-num2;
			System.out.println("Subtracted value is: "+subtraction);
			performArithmeticOperation();
			break;
			
		case 3:
			int multiplication;
			multiplication = num1*num2;
			System.out.println("Multiplied value is: "+multiplication);
			performArithmeticOperation();
			break;
			
		case 4:
			int division;
			division = num1%num2;
			System.out.println("Divided value is: "+division);
			performArithmeticOperation();
			break;
			
		case 5:
			System.out.println("Thank you...Have a Wonderful day!!");
			break;
		}
		
	}
	
	public static void main(String[] args) {
		ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
		arithmeticOperation.getNumbersFromUser();
		arithmeticOperation.performArithmeticOperation();
	}
}
