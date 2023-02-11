package com.example.datastructurepractice.java.matrix;

public class SquareSubMatrix {

	public static void main(String[] args)
    {
        int M[][]
            = { { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 },
                { 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 } };
 
        printMaxSubSquare(M);
    }
	
	
}
