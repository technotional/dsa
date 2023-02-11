package com.example.datastructurepractice.java;

import java.util.Arrays;

public class CandiesGreedyWithOneArray {

	public static void main(String[] args) {
		int[] arr = { 10, 9, 8, 7 };
		System.out.println(distributeCandy(arr));
	}

	public static int distributeCandy(int[] ranking) {
		//variable to store the minimum number of candies returned by the function      
				int sum = 0;
		//defining two arrays of the size as ranking array for traversing from both sides  
				int[] left2right = new int[ranking.length];
				int[] right2left = new int[ranking.length];
		//initially fill both arrays with 1  
				Arrays.fill(left2right, 1);
				Arrays.fill(right2left, 1);
		//traversing over the array in left to right fashion  
				for (int i = 1; i < ranking.length; i++) {
					if (ranking[i] > ranking[i - 1]) {
						left2right[i] = left2right[i - 1] + 1;
					}
				}
		//traversing over the array in right to left fashion  
				for (int i = ranking.length - 2; i >= 0; i--) {
					if (ranking[i] > ranking[i + 1] && left2right[i] <= left2right[i + 1]) {
						left2right[i] = left2right[i + 1] + 1;
					}
				}
		//finds maximum of arrays and adds the maximum value to the variable sum  
				for (int i = 0; i < ranking.length; i++) {
					sum = sum + left2right[i];
				}
		//returns the minimum number of candies to distribute  
				return sum;
			}
}
