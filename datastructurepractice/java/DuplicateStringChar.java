package com.example.datastructurepractice.java;

import java.util.HashSet;

public class DuplicateStringChar {

	public static void main(String[] args) {
		System.out.println(remove_dupli("abbccdeffggh"));
	}
	
	public static String remove_dupli(String s) {
	HashSet<Character> hset = new HashSet<Character>();
    char[] strArry = s.toCharArray();
    s = "";
    for(int i=0; i<strArry.length; i++){
        if(!hset.contains(strArry[i])){
            hset.add(strArry[i]);
            s = s + strArry[i];
        }
    }
    return s; 
	}
}
