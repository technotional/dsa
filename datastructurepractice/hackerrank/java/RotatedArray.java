package com.example.datastructurepractice.hackerrank.java;

import java.util.ArrayList;
import java.util.List;

public class RotatedArray {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
//		arr.add(4);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		System.out.println(search_element(arr, 4));
	}

	    /*
	     * Complete the 'search_element' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER_ARRAY arr
	     *  2. INTEGER target
	     */

	public static int search_element(List<Integer> arr, int target) {
        if(arr.size() == 0){
            return -1;
        }
        if(arr.size() == 1 && arr.size() == target){
            return 0;
        }
        int low = 0;
        int high = arr.size()-1;
        int start = -1;
        
        while(low<=high){
        int mid = low + ((high-low)/2);
            if(arr.get(mid) == target){
                return  mid;
            }
            if(arr.get(low) == target){
                return  low;
            }
            if(arr.get(high) == target){
                return  high;
            }
            if(high == low){
                start = low;
                break;
            }
            if(high < low){
                return  -1;
            }
            if((mid < high && arr.get(mid) < arr.get(mid+1)) && (mid > low && arr.get(mid) < arr.get(mid-1))){
                start = mid;
                break;
            }
            if(mid == low && arr.get(mid) < arr.get(mid+1)) {
            	start = mid;
            	break;
            }
            if(arr.get(mid) > arr.get(high)){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        
        if(start == -1 || arr.get(start) == target){
            return start;
        }
        
        low = 0;
        high = arr.size()-1;
        if(target > arr.get(high)){
           return findtarget(arr, low, start-1, target);
        }else{
           return findtarget(arr, start+1, high, target);
        }    
        

    }
    
    public static int findtarget(List<Integer> arr, int low, int high, int target) {
        if(low>high){
            return -1;
        }
        int mid = low + ((high-low)/2);
        if(arr.get(mid) == target){
            return mid;
        }
        if(arr.get(low) == target){
                return  low;
            }
            if(arr.get(high) == target){
                return  high;
            }
        
        if(mid > low && arr.get(mid) > target){
           return findtarget(arr, low, mid-1, target);
        } else {
            return findtarget(arr, mid+1, high, target);
        }
}
	}


