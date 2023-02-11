package com.example.datastructurepractice.hackerrank.java;

import java.util.ArrayList;
import java.util.List;

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
//		arr.add(3);
//		arr.add(7);
//		arr.add(7);
		arr.add(0);
		arr.add(0);
		arr.add(17);
		arr.add(34);
		arr.add(34);
		System.out.println(singlelement(5, arr));
		//3 3 7 7 8 11 11 - mid = 2
		//3 3 7 7 8 11 11 - mid = 3
		//2 2 1	- mid = 1
		//2 2 - mid = 0
		//1 2 2 - mid = 0
	}
	
	public static int singlelement(int n, List<Integer> arr) {
	    
		if(n%2 == 0) {
			return -1;
		}
		if(n == 1){
            return arr.get(0);
        }
		int low = 0;
		int high = n-1;
		int mid = -1;
		while(low <= high) {
			mid = low + ((high-low)/2);
		
			if(low == high) {
				return arr.get(low);
			}
			if(mid != low && arr.get(mid) != arr.get(mid-1) && arr.get(mid) != arr.get(mid+1)) {
				return arr.get(mid);
			}
			if((mid % 2 == 0 && arr.get(mid) == arr.get(mid+1)) || (mid % 2 != 0 && arr.get(mid) == arr.get(mid-1))){
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return arr.get(mid);

	    }
}
