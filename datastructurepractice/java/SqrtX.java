package com.example.datastructurepractice.java;

public class SqrtX {

	public static void main(String[] args) {
		SqrtX sqrt = new SqrtX();
		System.out.println(sqrt.mySqrt(2147395599));
	}
	public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
       return calculateSqRt(x, 1, x);
    }
    public int calculateSqRt(int x, long low, long high) {
        long mid = (low+(high-low)/2);
        if(mid * mid == x){
            return (int)mid;
        }
        else if(mid * mid < x && ((mid+1) * (mid+1) > x)){
            return (int)mid;
        }
        else if((mid * mid) > x){
            return (int)calculateSqRt(x, 1, mid-1);
        }
        else if((mid * mid) < x){
            return (int)calculateSqRt(x, mid+1, high);
        }
        else{
            return 0;
        }
    }
}
