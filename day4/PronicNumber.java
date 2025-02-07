package com.celcom.day4;
import java.util.Scanner;

public class PronicNumber {
	

	public static void main(String[] args) {
		
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in); {
		int num = sc.nextInt();
		int flag = 0;
		for(int i = 1; i <= num; i++) {
			if(i*(i+1) == num) {
				System.out.println("It is pronic");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("It is not pronic");
		}
			
		
		
		
		
		}	

	}

}
