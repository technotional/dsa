package com.example.datastructurepractice.java;

public class RotatedSortedArray {

	public static void main(String[] args) {
		RotatedSortedArray rsa = new RotatedSortedArray();
		int[] arr = {3,1};
		System.out.println(rsa.search(arr, 1));
	}

	public int search(int[] nums, int target) {
        return findElement(nums, 0, nums.length - 1, target, nums.length);
    }
public int findElement(int[] nums, int low, int high, int target, int length){
    int mid = low + (high-low)/2;
    if(nums[mid] == target){
        return mid;
    }
    if(low > high){
        return -1;
    }
    if(nums[low] < nums [high]){
        if(nums[mid] >= target){
            return findElement(nums, low, mid - 1, target, length);
        }else{
            return findElement(nums, mid + 1, high, target, length);
        }
    }else{
            if(nums[low] < nums[mid]){
                if(nums[low] <= target && nums[mid] >= target)
                    return findElement(nums, low, mid-1, target, length);
                else
                    return findElement(nums, mid+1, high, target, length);
            }
            if(nums[high] >= target && nums[mid] <= target) {
                return  findElement(nums, mid+1, high, target, length);
            }
            return findElement(nums, low, mid-1, target, length);
            }
        }
	
	
	
}
