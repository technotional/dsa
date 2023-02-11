package com.example.datastructurepractice.hackerrank.java;

import java.util.ArrayList;
import java.util.List;

public class TrappingWater {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(0);
		arr.add(1);
		arr.add(0);
		arr.add(2);
		arr.add(1);
		arr.add(0);
		arr.add(1);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(1);
		System.out.println(calculateWater(arr));
	}
	// 0 1 0 2 1 0 1 3 2 1 2 1
	public static int calculateWater(List<Integer> arr) {
		
		int res = 0;
		
		
		for(int i = 1; i < arr.size()-2; i++) {
			
			int left = arr.get(i);
			for(int j = 0; j < i; j++) {
				left = Math.max(left, arr.get(j));
				
			}
			
			int right = arr.get(i);
			for(int j = i+1; j < arr.size()-1; j++) {
				right = Math.max(right, arr.get(j));
				
			}
			res += Math.min(left, right) - arr.get(i);
		}
		return res;
	}
	
}
