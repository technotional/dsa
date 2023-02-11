package com.example.datastructurepractice.java;

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		SingleElementInSortedArray rsa = new SingleElementInSortedArray();
		int[] arr = {1,1,2,3,3,4,4,8,8};
		System.out.println(rsa.singleNonDuplicate(arr));

	}
	
	public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        else if(nums.length/2 != 0){
            return findSingleNonDuplicate(nums, 0, nums.length-1, nums.length);
        } 
        else{
            return -1;
        }
        
    }

    public int findSingleNonDuplicate(int[] nums, int low, int high, int length){
        int mid = low + (high-low)/2;
        
        if(low == 0 && nums[low] != nums[low+1]){
            return nums[low];
        }

        else if(high == length-1 && nums[high] != nums[high-1]){
            return nums[high];
        }

        else if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
            return nums[mid];
        }

        else if((mid%2 == 0 && nums[mid] != nums[mid+1]) || (mid%2 != 0 && nums[mid] != nums[mid-1])){
            return findSingleNonDuplicate(nums, low, mid-1, length);
        }
        else{
            return findSingleNonDuplicate(nums, mid+1, high, length);
        }   
        }

}
