package com.example.datastructurepractice.java;

public class DupliactesInSortedArray {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,4};
		
		System.out.println(findDup(arr) + " " + arr);

	}
	
	public static int findDup(int[] arr) {
		
		int j = 0;
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i] != arr[i+1]) {
				arr[j] = arr[i];
				j++;
			}
			
		}
		return j;
	}

}
