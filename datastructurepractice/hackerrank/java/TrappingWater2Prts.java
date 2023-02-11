package com.example.datastructurepractice.hackerrank.java;

import java.util.ArrayList;
import java.util.List;

public class TrappingWater2Prts {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(5);
		arr.add(1);
		arr.add(7);
		arr.add(1);
		arr.add(1);
		arr.add(5);
		arr.add(2);
		arr.add(7);
		arr.add(6);

		System.out.println(calculateWater(arr));
	}
	// 0 1 0 2             1 0 1 3 2 1 2 1
	public static int calculateWater(List<Integer> arr) {
		
		int ptr1 = 0;
		int ptr2 = arr.size()-1;
		int waterCount = 0;
		int leftMax = 0;
		int rightMax = 0;
		
		while(ptr1 < ptr2) {
			
			leftMax = Math.max(leftMax, arr.get(ptr1));
			rightMax = Math.max(rightMax, arr.get(ptr2));
			
			
			if(arr.get(ptr1) <= arr.get(ptr2)) {
				waterCount = waterCount + Math.min(leftMax, rightMax) - arr.get(ptr1);
				ptr1++;
			}
			
			else {
				waterCount = waterCount + Math.min(leftMax, rightMax) - arr.get(ptr2);
				ptr2--;
			}
		}
		return waterCount;
				
	}
	
}
