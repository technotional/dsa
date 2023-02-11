package com.example.datastructurepractice.hackerrank.java;

public class KthSmallestElement {

	public static void main(String[] args) {
		int[] a = {1000};
		int[] b = {1,2,3,4,5,6,7,8};
		int i = 4;
		System.out.println(fintkthelement(a, b, i));
	}

	
	public static int fintkthelement(int[] nums1, int[] nums2, int index) {
		int ptr1 = 0;
		int ptr2 = 0;
		int val = 0;
		while(index>=1) {
			if(ptr2 >= nums2.length || (ptr1 < nums1.length && nums1[ptr1] < nums2[ptr2])) {
				val = nums1[ptr1++];
			}else {
				val = nums2[ptr2++];
			}	
			index--;
		}
		return val;
	}

}
