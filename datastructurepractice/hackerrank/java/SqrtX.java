package com.example.datastructurepractice.hackerrank.java;

import com.example.datastructurepractice.java.SqrtX;

public class SqrtX {

	public static void main(String[] args) {
		
		SqrtX sqrt = new SqrtX();
		System.out.println(sqrt.mySqrt(0));
	}
	public int mySqrt(int x) {
		
		if(x==0){
            return x;
        }
		
		int low = 1;
		int high = x;
		
		while(low<= high) {
			long mid = low + (high-low)/2;
			
			if(low == mid) {
				return (int)mid;
			}
			
			if(mid * mid > x) {
				high = (int)mid;
			}else {
				low = (int)mid;
			}
		}
		
		return 0;
	}

}
