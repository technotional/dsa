package com.example.datastructurepractice.java;

import java.util.Arrays;

public class SortColors{
    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        int[] arr = {0,2,1};
        sortColors.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

        public void sortColors(int[] nums) {

            // [0,2,2,0,1,1,2]
            int low = 0;
            int mid = 0;
            int high = nums.length-1;
            while(mid <= high){
            	System.out.println(low+" "+mid+" "+high);
            	System.out.println(Arrays.toString(nums));
                if(nums[mid]==0){
                    swap(nums, low, mid);
                    low++;
                    mid++;
                   System.out.println("under mid=0 "+low+" "+mid+" "+high);
                   System.out.println("under mid=0 "+Arrays.toString(nums));
                }
                else if(nums[mid]==1){
                    mid++;
                }
                else if(nums[mid]==2){
                    swap(nums, high, mid);
                    high--;
                }
                System.out.println(Arrays.toString(nums));
            }        
            
        }
        
        public void swap(int[] nums, int i, int j){
        	System.out.println("under swap"+Arrays.toString(nums));
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp; 
            System.out.println("under swap"+Arrays.toString(nums));
        } 
}