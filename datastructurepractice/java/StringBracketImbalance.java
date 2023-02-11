package com.example.datastructurepractice.java;

public class StringBracketImbalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minSwaps("][[]][][[][]"));
	}

public static int minSwaps(String s) {
        
        char[] arry = s.toCharArray();
        int countleft = 0;
        int countright = 0;
        int imbalance = 0;
        for(int i=0; i<arry.length; i++){
            if(arry[i] == '['){ //[ ] [ ] ] [ ] [ [ ] [  ]
                countleft++;
            }else if(arry[i] == ']'){
                countright++;
                imbalance = countright - countleft;
            } 
        }
        if(imbalance%2 == 0){
            return imbalance/2;
        }else{
            return (imbalance+1)/2;
        }
    }
}
