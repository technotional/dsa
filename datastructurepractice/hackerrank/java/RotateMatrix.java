package com.example.datastructurepractice.hackerrank.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateMatrix {

	public static void main(String[] args) {
		
		 
        int mat[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
 
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> colmatrix = new ArrayList<Integer>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
            	colmatrix.add(j, mat[i][j]);
            }
            	matrix.add(colmatrix);
        }
        rotate(matrix);
	}
	
	public static void rotate(ArrayList<ArrayList<Integer>> matrix) {
        int n = matrix.size();
        int m = matrix.get(0).size();
		int temp=0;
		
        //transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               Collections.swap(matrix,matrix.get(i).get(j),matrix.get(j).get(i));
            }
        }
       for(int i=0;i<n;i++){
       int left=0,right=n-1;
       while(left<right){
           Collections.swap(matrix,matrix.get(i).get(left),matrix.get(i).get(right));
           left++;
           right--;
       }
    }
       for(int i=0;i<matrix.size();i++){
           for(int j=0;j<matrix.get(0).size();j++){
           	System.out.print(matrix.get(i).get(j) + " ");
           }
           System.out.println("/n");
       }
    }
}
