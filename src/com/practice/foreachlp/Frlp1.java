package com.practice.foreachlp;

public class Frlp1 {

	// 
	
	public static void main(String[] args) {
		//int arr[]= {1,2,3,7,8,4,5,1};
		int[] arr={1,2,3,7,8,4,5,1};
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 * 
		 * for(int value:arr) { System.out.println(value); }
		 */
		
		int sum=0;
		for(int value:arr) {
			sum += value; //sum=sum+value
		}
		System.out.println(sum);
		System.out.println(arr.length);
			
		System.out.println(sum/arr.length);

	}

}
