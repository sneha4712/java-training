package com.celcom.BankApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Bank {
	private Map<Integer, Account> bank = new HashMap<>();
	private Scanner sc = new Scanner(System.in);

	void createAccount() {
		System.out.println("Enter Account Number, Account Holder Name, Branch Name, Phone Number: ");
		int accountNum = sc.nextInt();
		sc.nextLine();
		String accHolderName = sc.nextLine();
		String branchName = sc.nextLine();
		long phoneNum = sc.nextLong();

		if (bank.containsKey(accountNum)) {
			System.out.println("Account Already Exists");
		} else {
			Account account = new Account(accountNum, accHolderName, branchName, phoneNum);
			bank.put(accountNum, account);
			System.out.println("Account Created Successfully");
		}
	}

	void deposit(int acc,float amount) {
		if(bank.containsKey(acc))
		{
			Account account = bank.get(acc);
			account.balance+=amount;
			System.out.println("Deposited");
			return;
		}
		System.out.println("Invalid Account number");
	}

	void withDraw(int acc, float amount) {
		if(bank.containsKey(acc)) {
			Account account = bank.get(acc);
			account.balance-=amount;
			System.out.println("Amount withdrawn successfully");
			return;
		}
		System.out.println("Amount withdrawn successfully");
	}

	void deleteAccount() {
		System.out.println("Enter Account Number:");
		int accountNum = sc.nextInt();

		if (bank.containsKey(accountNum)) {
			bank.remove(accountNum);
			System.out.println("Account Deleted Successfully");
		} else {
			System.out.println("Account Not Found");
		}
	}
}