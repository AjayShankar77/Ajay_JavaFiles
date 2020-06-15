package javaDay15Assignment;

import javaDay15Assignment.Account;

public class SavingsAccount extends Account {
	
	@Override
	boolean transact(Account another,String type,double amount) {
		if(type.equalsIgnoreCase("1"))
		{
			if((another.checkBalance()-amount)>5000.00) {
				another.setBalance(another.checkBalance()-amount);
				System.out.println("Withdrawal successfull.\nThe available balance is "+another.checkBalance());
			}
			else {
				System.out.println("Withdraw not possible. Insuff. Balance");
			}
		}
		else if(type.equalsIgnoreCase("2"))
		{
			another.setBalance(amount+another.checkBalance());
			System.out.println("Deposit success...!!!\nThe available balance is "+another.checkBalance());
		}else
			System.out.println("Incorrect choice");
		
			return true;
	}
	
}
