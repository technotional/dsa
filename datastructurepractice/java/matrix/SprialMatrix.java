package com.example.datastructurepractice.java.matrix;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		System.out.println(spiralOrder(a).toString());
	}

	//1  2  3  4
	//5  6  7  8
	//9 10 11 12
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<Integer>(); 
		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;

		while (true) {

			for (int i = left; i <= right; i++) {
				res.add(matrix[top][i]);
			}
			top++;

			if (top > bottom || left > right)
				break;

			for (int i = top; i <= bottom; i++) {
				res.add(matrix[i][right]);
			}
			right--;

			if (top > bottom || left > right)
				break;

			for (int i = right; i >= left; i--) {
				res.add(matrix[bottom][i]);
			}
			bottom--;

			if (top > bottom || left > right)
				break;

			for (int i = bottom; i >= top; i--) {
				res.add(matrix[i][left]);
			}
			left++;

			if (top > bottom || left > right)
				break;
		}
		return res;
	}

}
