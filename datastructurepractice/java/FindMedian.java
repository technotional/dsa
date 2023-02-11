package com.example.datastructurepractice.java;

public class FindMedian {

	public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = {3};
		System.out.println(findMedianSortedArrays(a, b));
	}

	
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        //odd - median 1, 5 - 2
        //even - median left and right, 4 - 1,2

        int arr1len = nums1.length;
        int arr2len = nums2.length;
        int totlen = arr1len + arr2len;
        double median = 0.00;

        if(totlen % 2 == 0){
            int m1 = 0;
            int m2 = 0;
            
            int ptr1 = 0;
            int ptr2 = 0;
            int count = (totlen/2);
            while(count >= 0) {
                //a= 1,3 b = 2,4
                //count 2,1,0
                //ptr1  1,2 ptr2, 1
            	m1 = m2;
                if(ptr2 == arr2len || (ptr1 < arr1len && nums1[ptr1] < nums2[ptr2])){
                    m2 = nums1[ptr1++];
                }else{
                    m2 = nums2[ptr2++];
                }
                count--;
            }
            median = (m1 + m2)/2;
        }else{
            int ptr1 = 0;
            int ptr2 = 0;
            int count = (totlen/2)-1;
            while(count >= 0) {
                if(ptr2 == arr2len || (ptr1 < arr1len && nums1[ptr1] < nums2[ptr2])){
                	median=nums1[ptr1++];
                }else{
                	median=nums2[ptr2++];
                }
                count--;
            }
    }
    return median;
}
}


