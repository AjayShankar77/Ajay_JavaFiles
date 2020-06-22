package javaDay17Assignment;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;

public class User {
	Scanner scanner;
	String name, dob, phone, hobby, email, password;
	int age;
	ArrayList<Integer> userList;
	
	User() {
		scanner = new Scanner(System.in);
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
