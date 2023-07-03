package com.greatlearning.services;

public class TransactionServiceImpl {

	public void search(int arr[],long target) {
		//System.out.println("Search to be done");
		
		long sum=0;
		boolean flag=true;
		for(int i=0; i< arr.length;i++) {
			sum +=arr[i];
			if(sum >= target) {
				System.out.println("Target achieved after "+(i+1) + " transactions ");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(" Given target is not achieved");
		}
	}
	
	public void search3(int arr[],long target) {
		long sum=0;
		boolean flag = true;
		
		int cs[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			cs[i] += arr[i];
		}
		
		for(int i=0; i< arr.length;i++) {
			if(cs[i] >= target) {
				System.out.println("Target achieved after "+(i+1) + " transactions ");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(" Given target is not achieved");
		}
	}

}
