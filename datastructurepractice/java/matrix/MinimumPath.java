package com.example.datastructurepractice.java.matrix;

public class MinimumPath {

	public static void main(String[] args)
    {
        int M[][]
//            = { { '0', '1', '1', '0', '1' }, 
//            	{ '1', '1', '0', '1', '0' },
//                { '0', '1', '1', '1', '0' }, 
//                { '1', '1', '1', '1', '0' },
//                { '1', '1', '1', '1', '1' }, 
//                { '0', '0', '0', '0', '0' } };
        		= {{1,2,3},
        		   {4,3,2},
        		   {1,9,33}};
 
        System.out.println(minimumPath(M));
    }
	
	 public static int minimumPath(int[][] arr) {
		 // Write your code here
	        int rowlen = arr.length;
	        int collen = arr[0].length;
	        int[][] aux = new int[rowlen][collen];
	        for(int i=0; i < rowlen; i++){
	            for(int j=0; j < collen; j++){
	                if(i==0 && j==0){
	                     aux[i][j] = arr[i][j];
	                }else{
	                    int value = arr[i][j];
	                    int left = Integer.MAX_VALUE;
	                    int top = Integer.MAX_VALUE;
	                    if(i != 0){
	                        top = aux[i-1][j];
	                    }
	                    if(j != 0){
	                        left = aux[i][j-1];
	                    }
	                    int minPath = Math.min(left, top);
	                    aux[i][j] = value + minPath;
	                }
	            }
	        }
	    return aux[rowlen-1][collen-1];
	 }
}
