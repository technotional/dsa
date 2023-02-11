package com.example.datastructurepractice.hackerrank.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandiesGreedy {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
//		arr.add(6);
//		arr.add(1);
//		arr.add(7);
//		arr.add(8);
//		arr.add(9);
//		arr.add(2);
//		arr.add(1);

		System.out.println(distributeCandies(arr));
	}
	// 1 2 3 2 1
	// 10 8 9 8 7 - 1 0 1 1 , 0 1 0 0 - 1 0 1 0 0, 1 0 1 1 1
	// 1 2 3 4
	// 10 8 9 1 2 3

	public static long distributeCandies(List<Integer> arr) {
		long count = 0;
        int[] left2Right = new int[arr.size()];
        Arrays.fill(left2Right, 1);
        
        for(int i=1; i<arr.size(); i++){
            if(arr.get(i)>arr.get(i-1)){
            	left2Right[i] = left2Right[i-1]+1;
            }
        }
        
        for(int i=arr.size()-2; i>-1; i--){
            if(arr.get(i)>arr.get(i+1)){
            	left2Right[i] = Math.max(left2Right[i], (left2Right[i+1]+1));
            }
        }
        System.out.println(Arrays.toString(left2Right));
        
        for(int i=0; i<left2Right.length; i++){
            count += left2Right[i];
        }
        
        return count;
	}

}
