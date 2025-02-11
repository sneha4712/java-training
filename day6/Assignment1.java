package com.celcom.day6;

import java.util.Arrays;
import java.util.Scanner;

class DuplicateException extends Exception {
	public DuplicateException(String message) {
		super(message);
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the number of integer");
		
		int arr[] = new int[6];
		for(int index = 0; index < 6; index++) {
			arr[index]=sc.nextInt();
		}
		try {
			checkDuplicate(arr);
			System.out.println("Duplicate not found");
		}
		catch(DuplicateException e) {
			System.out.println(e.getMessage());
		}
	}
		public static void checkDuplicate(int[] arr) throws DuplicateException {
			for (int i =0;i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i] == arr[j]) {
						throw new DuplicateException("Duplicate present: " + arr[i]);
					}
				}
			}
	}

}
