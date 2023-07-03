package com.greatlearning.driver;
import java.util.Scanner;

import com.greatlearning.services.TransactionServiceImpl;

public class Main {

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		//System.out.println("Transactions to be entered");
		System.out.println("Enter the size of transaction array");
		TransactionServiceImpl transactionServiceImpl = new TransactionServiceImpl(); 
		
		int size = s.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the values of array");
		
		for(int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNo = s.nextInt();
		
		while(targetNo-- !=0) {
			long target;
			System.out.println("Enter the value of target");
			target = s.nextInt();
			transactionServiceImpl.search(arr, target);
		}
		
	}
	
}
