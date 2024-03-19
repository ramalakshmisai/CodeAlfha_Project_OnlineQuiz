package com.ty;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BankImp implements Bank{
	Map<String,Bankuser> db=new LinkedHashMap<String,Bankuser>();
	Scanner sc=new Scanner(System.in);
	@Override
	public void account_details() {
		System.out.println("enter the accno of the user");
		String accno=sc.next();
		System.out.println("enter the name of the user");
		String name=sc.next();
		System.out.println("enter the gender of the user");
		String gender=sc.next();
		Bankuser b=new Bankuser(accno, name, gender);
		db.put(b.getAccno(), b);
		 System.out.println("the user Record is inserted successfully");
		 System.out.println("your Bank account number is "+b.getAccno());
		
	}
	int balance;
	BankImp(int balance)
	{
		this.balance=balance;
	}
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs. "+amount);
		balance=balance+amount;
		System.out.println("Amount deposited successfully ");
		System.out.println("total amount in the account "+balance);
		
	}

	@Override
	public void withdraw(int amount) {
		if(amount<=balance)
		{
			System.out.println("Withdrawing Rs."+amount);
			balance=balance-amount;
			System.out.println("Amount Withdrawn Successfully ");
			System.out.println("total amount in the account "+balance);
		}
		else
		{
			try
			{
				throw new InsufficientBalanceException("Insufficient balance");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void checkbalance() {
		  
		System.out.println("Avaliable Balance : Rs."+balance);
	}

	
		
}
