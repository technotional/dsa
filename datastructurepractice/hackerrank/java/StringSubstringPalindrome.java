package com.example.datastructurepractice.hackerrank.java;

import java.util.ArrayList;
import java.util.List;

public class StringSubstringPalindrome {

	public static void main(String[] args) {
		List<List<String>> str = partition("llm", 3);
		for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
            	System.out.print(str.get(i).get(j));
            }
            System.out.println("");
           }

	}

public static List<List<String>> partition(String s, int n) {
        
        int len = s.length();
        List<String> arrList = new ArrayList<String>();
        for(int i=0; i<len; i++){
            expand(s, i, i, arrList); 
        }
        for(int i=0; i<len; i++){
            expand(s, i, i+1, arrList); 
        }
        List<List<String>> str = new ArrayList<List<String>>();
        for(int i=0; i<n; i++){
            str.add(i, new ArrayList<String>());
        }
        int k = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(k < arrList.size()){
                    str.get(i).add(j,arrList.get(k));
                    k++;
                }else{
                    break;
                }
            }
        }
        return str;
    }
    public static void expand(String str, int l, int h, List<String> arrList){
        
        while(l>=0 && h<str.length() && str.charAt(l)==str.charAt(h)){
            if(str.substring(l,h+1) != "") {
            	arrList.add(str.substring(l,h+1));
            }
            l--;
            h++;
        }
    }
}
