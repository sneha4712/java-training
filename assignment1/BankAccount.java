package com.celcom.assignment1;


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Account {
	int accountNum;
	String accHolderName;
	String branchName;
	long phoneNum;
	double balance;
	
	Account(int accountNum, String accHolderName, String branchName, long phoneNum) {
		this.accountNum = accountNum;
		this.accHolderName = accHolderName;
		this.branchName = branchName;
		this.phoneNum = phoneNum;
	}

	void deposit(float amount) { // To deposit amount
		balance += amount;
	}

	void withDraw(float amount) { // To withdraw amount
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance");
		}
	}
}

class Bank {
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

public class BankAccount {
int a;
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
