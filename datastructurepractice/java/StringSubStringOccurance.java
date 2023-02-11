package com.example.datastructurepractice.java;

public class StringSubStringOccurance {

	public static void main(String[] args) {
		System.out.println(strStr("mississippi", "issip"));
	}

	public static int strStr(String haystack, String needle) {

		char[] main = haystack.toCharArray();
		char[] sub = needle.toCharArray();
		int counter = 0;

		for (int i = 0; i < (main.length - sub.length); i++) {
			while (main[i + counter] == sub[counter]) {
				counter++;
				if (counter == sub.length) {
					return i;
				}
			}

			counter = 0;
		}
		return -1;
	}

}
