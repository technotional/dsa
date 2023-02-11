package com.example.datastructurepractice.java.matrix;

public class MaximalSquare {
	
	public static void main(String[] args)
    {
        char M[][]
//            = { { '0', '1', '1', '0', '1' }, 
//            	{ '1', '1', '0', '1', '0' },
//                { '0', '1', '1', '1', '0' }, 
//                { '1', '1', '1', '1', '0' },
//                { '1', '1', '1', '1', '1' }, 
//                { '0', '0', '0', '0', '0' } };
        		= {{'1','0','1','0','0'},
        		   {'1','0','1','1','1'},
        		   {'1','1','1','1','1'},
        		   {'1','0','0','1','0'}};
 
        System.out.println(maximalSquare(M));
    }

	 public static int maximalSquare(char[][] arr) {
         int maxSize=1;
         int m = arr.length;
         int n = arr[0].length;
        int[][] auxMatrix = new int[m][n];
            
        //Set 1st column to 0
            for(int i = 0; i < m; i++){
                auxMatrix[i][0] = Character.getNumericValue(arr[i][0]);
            }
        
        //Set 1st row to 0
            for(int i = 0; i < n; i++){
                auxMatrix[0][i] = Character.getNumericValue(arr[0][i]);
            }
        
            for(int i = 1; i < m; i++){
                for(int j = 1; j < n; j++){
                    if(Character.getNumericValue(arr[i][j]) == 1){
                        auxMatrix[i][j] = Math.min(auxMatrix[i][j-1], Math.min(auxMatrix[i-1][j], auxMatrix[i-1][j-1])) + 1;
                    }else{
                        auxMatrix[i][j] = 0;
                    }
                }
            }
        
        for(int i = 1; i < m; i++){
                for(int j = 1; j < n; j++){
                    if(auxMatrix[i][j] > maxSize){
                        maxSize = auxMatrix[i][j];
                    }
                }   
            }
        return maxSize;
    }
}
