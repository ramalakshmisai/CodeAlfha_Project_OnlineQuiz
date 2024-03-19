package com.ty;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Welcome to SBI Bank");
		System.out.println("***************************");
		Scanner sc=new Scanner(System.in);
		Bank bb=new BankImp(5000);
		while(true)
		{
			System.out.println("1.add user\n2.Deposit amount\n3.withdraw amount\n4.check balance\n5.exit");
			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:bb.account_details();
			break;
			case 2:
				System.out.println("Enter amount to be deposited:");
				int amountToDeposit=sc.nextInt();
				bb.deposit(amountToDeposit);
				break;
			case 3:
				System.out.println("enter amount to be withdrawn:");
				int amountToWithdrawn=sc.nextInt();
				bb.withdraw(amountToWithdrawn);
				break;
			case 4:
				bb.checkbalance();
				break;
			case 5:
				System.out.println("Thank you! Visit Again...");
				System.out.println();
				break;
			default:
				System.out.println("Invalid choice,kindly enter valid choice");
			}
			System.out.println("**********************");
		}
	}
}
