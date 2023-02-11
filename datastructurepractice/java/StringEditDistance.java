package com.example.datastructurepractice.java;

public class StringEditDistance {

	public static void main(String[] args) {
		System.out.println(minDistance("horse","ros"));

	}
	
	public static int minDistance(String word1, String word2) {
        int res = 0;
        int len1 = word1.length();
        int len2 = word2.length();
        if(len1 == 0 && len2 == 0) {
        	return 0;
        }
        if(len1 == 0) {
        	return len2;
        }
        if(len2 == 0) {
        	return len1;
        }
        int[][]DP = new int[len1+1][len2+1];
        DP[0][0] = 0;
        for(int i=1; i<=len1; i++){
            DP[i][0] = i; 
        }
        for(int j=1; j<=len2; j++){
            DP[0][j] = j; 
        }
        
        for(int i=1; i<=len1; i++){
            for(int j=1; j<=len2; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    DP[i][j] = DP[i-1][j-1];
                }else{
                    DP[i][j] = (Math.min(DP[i-1][j], (Math.min(DP[i][j-1], DP[i-1][j-1])))) + 1;
                }
            }
        }
        return DP[len1][len2];
    }

}
