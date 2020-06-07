package javaDay9Assignment;
import java.util.Scanner;

public class FindTheGreatest {
	Scanner scanner;
	int num1, num2, num3;
	
	FindTheGreatest() {
		scanner = new Scanner(System.in);
	}
	
	void getNumbersFromUser() {
		System.out.println("Enter the first number");
		num1 = scanner.nextInt();
		System.out.println("Enter the second number");
		num2 = scanner.nextInt();
		System.out.println("Enter the third number");
		num3 = scanner.nextInt();
	}
	
	void findAndPrintGreatest() {
		if(num1 == num2 | num1 == num3 | num2 == num3) {
			System.out.println("Incorrect Entry... Please enter the numbers again...");
			getNumbersFromUser();
			findAndPrintGreatest();
		}
		else if(num1 > num2 && num1 > num3)
				System.out.println("Number 1 is greatest");
		else if(num2 > num3)
				System.out.println("Number 2 is greatest");
		else
			System.out.println("Number 3 is greatest");
	}

	public static void main(String[] args) {
		FindTheGreatest findTheGreatest = new FindTheGreatest();
		findTheGreatest.getNumbersFromUser();
		findTheGreatest.findAndPrintGreatest();
	}

}
