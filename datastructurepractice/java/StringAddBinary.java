package com.example.datastructurepractice.java;

public class StringAddBinary {

	public static void main(String[] args) {
		System.out.println(addBinary("11","1"));

	}

public static String addBinary(String a, String b) {
        
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        int l1 = ch1.length-1;
        int l2 = ch2.length-1;
        int len = ch1.length>ch2.length?ch1.length:ch2.length;
        int carry = 0;
        
        String str="";
        while(l1 >= 0 || l2 >=0){
            int sum = 0;
            sum = sum + carry;
            if(l1 >= 0) sum += ch1[l1] - '0';
            if(l2 >= 0) sum += ch2[l2] - '0';
            str = (sum%2) + str;
            carry = sum/2;
            l1--;
            l2--;
            }
        return (carry==1)?'1'+str:str;
        }
}
