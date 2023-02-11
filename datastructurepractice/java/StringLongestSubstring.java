package com.example.datastructurepractice.java;

public class StringLongestSubstring {

	public static void main(String[] args) {
		System.out.println(longestUniqueSubsttr("Goblinforgreatnoi"));

	}

	public static int longestUniqueSubsttr(String s)
    {
//        String test = "";
// 
//        // Result
//        int maxLength = -1;
// 
//        // Return zero if string is empty
//        if (str.isEmpty()) {
//            return 0;
//        }
//        // Return one if string length is one
//        else if (str.length() == 1) {
//            return 1;
//        }
//        for (char c : str.toCharArray()) {
//            String current = String.valueOf(c);
// 
//            // If string already contains the character
//            // Then substring after repeating character
//            if (test.contains(current)) {
//                test = test.substring(test.indexOf(current)
//                                      + 1);
//                
//            }
//            System.out.print(test + " , ");
//            test = test + String.valueOf(c);
//            maxLength = Math.max(test.length(), maxLength);
//        }
// 
//        return maxLength;
		
		int len = s.length();
        int maxLength = 0;
        String temp = "";
        for(int i = 0; i< len; i++){
            String s1 =  String.valueOf(s.charAt(i));
            
            if(temp.contains(s1)){
                //temp = "";
                temp = temp.substring(temp.indexOf(s1) + 1);
            }
            
            temp = temp + s1;
            maxLength = Math.max(temp.length(), maxLength);
        }
return maxLength;
    }
 
}
