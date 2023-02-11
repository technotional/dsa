package com.example.datastructurepractice.java.matrix;

public class RotateMatrix {

	public static void main(String[] args) {
		
		 
        int mat[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
 
        
        rotateMatrix(mat, mat.length);
	}
	//Reverse		//Transpose
	//4  3  2  1	//1  5  9  13
	//8  7  6  5	//2  6  10 14
	//12 11 10 9	//3  7  11 15
	//16 15 14 13	//4  8  12 16
	
	//4 8 12 16
	//3 7 11 15
	//2 6 10 14
	//1 5 9  13
	
	public static void rotateMatrix(int[][] matrix, int matrixRowLength) {
		
		// Reverse Matrix
        reverseMatrix(matrix, matrix.length);
		
		// Transpose Matrix
        transposeMatrix(matrix, matrix.length);
        
        // Display Matrix
        displayMatrix(matrix, matrix.length);
	}
	
	public static void reverseMatrix(int[][] matrix, int matrixRowLength) {
		for(int p1 = 0; p1 < matrixRowLength; p1++) {
			int left = 0;
			int right = matrixRowLength-1;
			
			while(left < right) {
				int temp = matrix[p1][left];
				matrix[p1][left] = matrix[p1][right];
				matrix[p1][right] = temp;
				left++;
				right--;
			}
		}	
	}
	
	public static void transposeMatrix(int[][] matrix, int matrixRowLength) {
		for(int p1 = 0; p1 < matrixRowLength; p1++) {
			for(int p2 = p1; p2 < matrixRowLength; p2++) {
				int temp = matrix[p1][p2];
				matrix[p1][p2] = matrix[p2][p1];
				matrix[p2][p1] = temp;
			}
		}	
	}
	

	
	public static void displayMatrix(int[][] matrix, int matrixRowLength) {
		for(int p1 = 0; p1 < matrixRowLength; p1++) {
			for(int p2 = 0; p2 < matrixRowLength; p2++) {
				System.out.print(matrix[p1][p2] + " ");
			}
			System.out.println(" ");
		}
	}

	
}
