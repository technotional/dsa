package com.example.datastructurepractice.java;

import java.util.HashMap;

public class TwoSumEqualToTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,5,11};
		int[] res = new int[2];
		res = twoSum(arr, 10);
        System.out.println(res[0]+" "+res[1]);
	}

	 public static int[] twoSum(int[] nums, int target) {
	        // int ptr1 = 0;
	        // int ptr2 = nums.length-1;
	        // int[] res = new int[2];
	        // Arrays.sort(nums);
	        // while(ptr1 < ptr2){
	        //     int sum = nums[ptr1] + nums[ptr2];
	        //     if(sum > target){
	        //         ptr2--;
	        //     }else if(sum == target){
	        //         res[0] = ptr1;
	        //         res[1] = ptr2;
	        //         break;
	        //     }else{
	        //         ptr1++;
	        //     }
	        // }
	        // return res;

	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        int[] res = new int[2];
	        for(int i = 0; i < nums.length; i++){
	            int diff = target - nums[i];
	            if(map.containsKey(diff)){
	            	res[0] = map.get(diff).intValue();
	                res[1] = i;
	                break;
	            }
	            map.put(nums[i], i);
	        }
	        return res;
	    }
}
