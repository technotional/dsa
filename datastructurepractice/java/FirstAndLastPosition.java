package com.example.datastructurepractice.java;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		List<Integer> solArry = new ArrayList<>();
		solArry.add(1);
//		solArry.add(7);
//		solArry.add(7);
//		solArry.add(8);
//		solArry.add(8);
//		solArry.add(10);
        System.out.println(search_element(solArry, 1).toString());
	}


    public static List<Integer> search_element(List<Integer> arr, int target) {
    // Write your code here
        List<Integer> returnValues = new ArrayList<Integer>();
            int length = arr.size();
            if(length == 0){
                returnValues.add(0,-1);
                returnValues.add(1,-1);
            }
            else if(length == 1){
                if(arr.get(0) == target){
                    returnValues.add(0);
                    returnValues.add(0);
                }
                else
                   returnValues.set(0,-1);
                   returnValues.set(1,-1); 
            }
        else{
            returnValues.add(firstOrr(arr, 0, length-1, target, length));
            returnValues.add(lastOrr(arr, 0, length-1, target, length));
        }
        return returnValues;
        
    }
    
    public static int firstOrr(List<Integer> arr, int low, int high, int target, int length) {
            if(high >= low){
            int mid = low + (high-low)/2;
                if(arr.get(mid) == target && (mid == 0 || (mid > 0 && arr.get(mid-1)<target))){
                    return mid;
                }
                else if(arr.get(mid)<target) {
                    return firstOrr(arr, mid+1, high, target, length);
                }
                else if (mid > 0) {
                    return firstOrr(arr, low, mid-1, target, length);
                }
                else{
                        return -1;
                    }
            }
        else{
            return -1;
        }
    }
    
    public static int lastOrr(List<Integer> arr, int low, int high, int target, int length) {
        if(high >= low){
                int mid = low + (high-low)/2;
                    if(arr.get(mid) == target && (mid == length-1 || (mid < length-1 && arr.get(mid+1)>target))){
                        return mid;
                    }
                    else if(arr.get(mid) > target) {
                        return lastOrr(arr, low, mid-1, target, length);
                    }
                    else if (mid < length-1){
                        return lastOrr(arr, mid+1, high, target, length);
                    }
                    else{
                        return -1;
                    }
                }
         else{
             return -1;
         }
        
    }
   

}


