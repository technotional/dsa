package com.example.datastructurepractice.hackerrank.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		
		System.out.println(anagram("fdhlvosfpafhalll"));
	}

	public static int anagram(String s) {
	    
//		int len = s.length();
//		if(len%2 != 0) {
//			return -1;
//		}
//		String s1 = s.substring(0,len/2);
//		String s2 = s.substring((len/2), len);
//		int len1 = s1.length();
//		int len2 = s2.length();
//		int[][] DP = new int[len1+1][len2+1];
//		
//		DP[0][0] = 0;
//		for(int i=0; i<DP.length; i++) {
//			DP[i][0] = i;
//			DP[0][i] = i;
//		}
//		char[] c1 = s1.toCharArray();
//		char[] c2 = s1.toCharArray();
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		s1 = "";
//		s2 = "";
//		for(int i=0; i<len1; i++) {
//			s1 = s1+c1[i];
//			s2 = s2+c2[i];
//		}
//		
//		for(int i=1; i<DP.length; i++) {
//			for(int j=1; j<DP[0].length; j++) {
//				if(s1.charAt(i-1) == s2.charAt(j-1)) {
//					DP[i][j] = DP[i-1][j-1];
//				}else {
//					DP[i][j] = Math.min(DP[i-1][j], Math.min(DP[i][j-1], DP[i-1][j-1])) + 1;
//				}
//				
//			}
//		}
//		return DP[len1][len2];
//	    }
		
		if(s.length()%2!=0) return -1;
        char[] ch = s.toCharArray();
        int n=s.length();
        int count = 0;
        int[] hash = new int[26];
        for(int i=0;i<n;i++) {
            int k = i < n/2 ? 1 :-1;
            hash[ch[i]-'a'] = hash[ch[i]-'a'] + k;
        }
        for(int x:hash) if(x>0) count +=x;
        return count;
        
//        if(s.length()%2!=0) return -1;
//        char[] ch = s.toCharArray();
//        int n=s.length();
//        int count = 0;
//        int[] hash = new int[26];
//        for(int i=0;i<n;i++) {
//        	hash[ch[i]-'a'] += i;
//        	if(i < n/2) {
//        		hash[ch[i]-'a'] = 1;
//        	}else {
//        		hash[ch[i]-'a'] = -1;
//        	}
//        }
//        for(int x:hash) {
//        	if(x>0) {
//        		count = x + count;
//        	}
//        }
//        return count;
	}
}
