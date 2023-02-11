package com.example.datastructurepractice.java;

public class LeftSmallerRightBigger {

	public static void main(String[] args) {
		int[] arr = {10,6,3,1,5,11,6,1,11,12};
        System.out.println(findElement(arr, 10));

	}

	
	public static int findElement(int arr[], int n){
        
	    int[] left2RightMaxArry = new int[arr.length];
	    int[] right2LeftMinArry = new int[arr.length];
	    left2RightMaxArry[0] = arr[0];
	    right2LeftMinArry[arr.length-1] = arr[arr.length-1];
	    
	    for(int i=1; i<arr.length; i++){
	        left2RightMaxArry[i] = Math.max(left2RightMaxArry[i-1], arr[i]);
	  
	    }
	    
	    for(int i=arr.length-2; i>=0; i--){
	         right2LeftMinArry[i] = Math.min(right2LeftMinArry[i+1], arr[i]);
	    }
	    
	    for(int i=1; i<arr.length-1; i++){
	        if(arr[i] >= left2RightMaxArry[i-1] && arr[i] <= right2LeftMinArry[i+1]){
	            return arr[i];
	        }
	    }
	    return -1;
	    }
}
