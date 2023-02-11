package com.example.datastructurepractice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MissingAndRepeating {

	
	public static void main(String[] args) {
		List<Integer> solArry = new ArrayList<>();
		solArry.add(3);
		solArry.add(1);
		solArry.add(3);
		System.out.println(find_missing(solArry).toString());
		
		Integer[] arr = new Integer[solArry.size()];
		arr = solArry.toArray(arr);
//		int d = arr[0];
//		System.out.println("d"+d);
		int[] arrArr = {1};
		List<Integer> arryList = new ArrayList<>();
		arryList.addAll(Collections.);
		
	}
	
	public static List<Integer> find_missing(List<Integer> arr) {
        List<Integer> solArry = new ArrayList<>();
        for(int i=0; i<=arr.size()-1; i++){
        	int j = arr.get(i);
                if(j < 1){
                    solArry.add(arr.get(i)*-1);
                }
            else{
            	j--;
                arr.set(j, arr.get(j)*-1);
            }
            }
        for(int i=0; i<=arr.size()-1; i++){
                if(arr.get(i) > 0){ 
                  solArry.add(i+1);  
                }
            }
        return solArry;
        }
}
