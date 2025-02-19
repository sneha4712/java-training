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
	
	Account(int accountNum, String accHolderName, String branchName,long phoneNum){
		this.accountNum= accountNum;
		this.accHolderName = accHolderName;
		this.branchName = branchName;
		this.phoneNum = phoneNum;
	}
	
		void deposit(int amount) { //To deposit amount
			balance += amount;
		}
		
		void withDraw(int amount) //To withdraw amount
		{
			balance -= amount;
		}
	}
class Bank{
	private Map<Integer,Account> bank = new HashMap<>();
	Scanner sc = new Scanner(System.in);
    Account account = new Account(sc.nextInt(), sc.next(), sc.next(), sc.nextLong());

	void deposit(int amount)
	{
		account.deposit(amount);
		System.out.println("Amount deposited successfully");
	}

	void withDraw(int amount) {
		account.withDraw(amount);
		System.out.println("Amount withdrawn successfully");
	}
	void setData() {
		if(bank.containsKey(account.accountNum))
		{
			//System.out.println("Account Already Exist");
		}
		else {
			bank.put(account.accountNum, account);
		}
		//System.out.println("Account added sucessfully");
	}

}
public class BankAccount {

	public static void main(String[] args) {
		System.out.println("Enter your Account number: ,  AccountHolder Name: , BranchName: , PhoneNumber: ");
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		while(true) {
			System.out.println("Please enter your choice");
			System.out.println(" 1.Deposit");
			System.out.println(" 2.Withdraw");
			System.out.println(" 3.Exit"); 
			int choice = sc.nextInt();
			bank.setData();
			
			switch(choice) {
			case 1:
				System.out.println("Please Enter the Deposit Amount");
				bank.deposit(sc.nextInt());
				break;
			case 2:
				System.out.println("Please Enter the Amount for Withdrawal");
				bank.withDraw(sc.nextInt());
				break;
			case 3:
				System.out.println("Thank you Visit Again:)");
				System.exit(0);
			default:
				System.out.println("Please Enter a Valid Option");
			}

		}
 
	}
 
}