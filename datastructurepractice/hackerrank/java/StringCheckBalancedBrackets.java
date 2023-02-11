package com.example.datastructurepractice.hackerrank.java;

import java.util.Stack;

public class StringCheckBalancedBrackets {
	
	public static void main(String[] args) {
		
		System.out.println(isBalanced("{{[[(())]]}}"));
	}
	
	 public static String isBalanced(String s) {
		   
		 Stack<Character> stk = new Stack<Character>();
		 
		 char[] ch = s.toCharArray();
		 for(int i=0; i<ch.length; i++) {
			 if(ch[i] == ')') {
				 if(stk.pop() != '(') {
					 return "No";
				 }
			 }
			 if(ch[i] == ']') {
				 if(stk.pop() != '[') {
					 return "No";
				 }
			 }
			 if(ch[i] == '}') {
				 if(stk.pop() != '{') {
					 return "No";
				 }
			 }
			 if(ch[i] == '{' || ch[i] == '[' || ch[i] == '(') {
				 stk.push(ch[i]);
			 }
		 }
		 if(stk.isEmpty()) {
			 return "Yes";
		 }else {
			 return "No";
		 }

	 }
}
