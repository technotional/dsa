package com.example.datastructurepractice.hackerrank.java;

import java.util.ArrayList;
import java.util.List;

public class CandiesBruteForce {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(2);
		arr.add(4);
		arr.add(2);
		arr.add(6);
		arr.add(1);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(2);
		arr.add(1);

		System.out.println(distributeCandies(arr));
	}
	//1 2 3 2 1
	//10 8 9 8 7 - 1 0 1 1 , 0 1 0 0 - 1 0 1 0 0, 1 0 1 1 1
	//1 2 3 4
	//10 8 9 1 2 3
	public static int distributeCandies(List<Integer> arr) {
		List<Integer> cadies = new ArrayList<>();
		for(int i=0;i<arr.size();i++) {
			cadies.add(i,1);
		}
		int plus = arr.size();
		
		for(int i=0;i<arr.size()-1;i++) {
			if(arr.get(i) > arr.get(i+1)) {
				cadies.add(i,cadies.get(i)+1);
				plus++;
			}
		}
		for(int i=1;i<=arr.size()-1;i++) {
			if(arr.get(i) > arr.get(i-1) && cadies.get(i) <= cadies.get(i-1)) {
				plus++;
			}else if(arr.get(i) < arr.get(i-1) && cadies.get(i) >= cadies.get(i-1)) {
				plus++;
			}
		}
		return plus;
	}

}
