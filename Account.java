package com.celcom.BankApplication;

public class Account {
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

}