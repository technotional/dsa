package com.example.datastructurepractice.hackerrank.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Closest3Sum {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(4);
		arr.add(2);
		arr.add(-1);
		arr.add(-111);
		arr.add(7);
		arr.add(0);
		arr.add(12);
		System.out.println(find3SumClosest(arr, 10));
	}

	public static int find3SumClosest(List<Integer> nums, int target) {
		Collections.sort(nums);
		int closestSum = Integer.MAX_VALUE;
		int sum=0;
		for(int i=0; i<nums.size()-2; i++) {
			int ptr1 = i+1;
			int ptr2 = nums.size()-1;
			while(ptr1<ptr2) {
				sum = nums.get(i)+nums.get(ptr1)+nums.get(ptr2);
				int xdiff = Math.abs(target - sum);
				int ydiff = Math.abs(target - closestSum);
				if(xdiff < ydiff) {
					closestSum = sum;
				}
				if(sum > target) {
					ptr2--;
				}
				else {
					ptr1++;
				}	
			}
		}
		return closestSum;
	}
}