package com.celcom.BankApplication;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();

		while (true) {

			// bank.setData();
			// System.out.println("Enter your Account number: , AccountHolder Name: ,
			// BranchName: , PhoneNumber: ");
			System.out.println("Please enter your choice");
			System.out.println(" 1.Deposit");
			System.out.println(" 2.Withdraw");
			System.out.println(" 3.ADD Account");
			System.out.println(" 4.Delete Account");
			System.out.println(" 5.Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the account number");
				int acc = sc.nextInt();
				System.out.println("Please Enter the Deposit Amount");
				bank.deposit(acc,sc.nextFloat());
				break;
			case 2:
				System.out.println("Enter the account number");
				int acc1 = sc.nextInt();
				System.out.println("Please Enter the Amount for Withdrawal");
				bank.withDraw(acc1,sc.nextFloat());
				break;
			case 3:
				bank.createAccount();
				break;
			case 4:
				bank.deleteAccount();
				break;
			case 5:
				System.out.println("Thank you Visit Again:)");
				System.exit(0);
			default:
				System.out.println("Please Enter a Valid Option");
			}
		}
	}
}