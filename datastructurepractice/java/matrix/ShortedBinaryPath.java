package com.example.datastructurepractice.java.matrix;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ShortedBinaryPath {

	static class Point {
		int x;
		int y;

		Point(int a, int b) {
			x = a;
			y = b;
		}
	}

	static class QueueNode {
		Point p;
		int dist;

		QueueNode(Point pnt, int dst) {
			p = pnt;
			dist = dst;
		}
	}

	public static void main(String[] args) {

		int mat[][] = { { 0, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, 
						{ 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
						{ 1, 0, 1, 0, 1, 1, 0, 1, 0, 1 }, 
						{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 }, 
						{ 1, 1, 1, 0, 0, 1, 1, 0, 1, 0 },
						{ 1, 0, 1, 0, 1, 0, 0, 1, 0, 0 }, 
						{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
						{ 1, 0, 1, 1, 1, 1, 0, 1, 0, 1 },
						{ 1, 1, 0, 0, 0, 0, 1, 0, 0, 0 } };
		
//		int mat[][] = { { 0, 1, 1, 1 }, 
//						{ 1, 0, 1, 1 },
//						{ 1, 0, 0, 1 }, 
//						{ 1, 0, 0, 0 }};

		System.out.println(shortestPathDFS(mat));
	}

	public static int shortestPathDFS(int[][] grid) {
		int rowlen = grid.length;
		int collen = grid[0].length;
		if (grid[0][0] != 0 && grid[rowlen - 1][collen - 1] != 0) {
			return -1;
		}
		int[][] visited = new int[rowlen][collen];
		int[] adj1 = { 0, 0, 1, 1, 1, -1, -1, -1 };
		int[] adj2 = { 1, -1, -1, 0, 1, -1, 0, 1 };
		Queue<QueueNode> queue = new ArrayDeque<>();
		Point point = new Point(0, 0);
		QueueNode node = new QueueNode(point, 1);
		queue.add(node);

		while (!queue.isEmpty()) {
			QueueNode qnode = queue.poll();
			int curr = qnode.dist;
			int ax1 = qnode.p.x;
			int ax2 = qnode.p.y;

			if (isValid(ax1, ax2, grid, visited)) {
				visited[ax1][ax2] = 1;

				if (ax1 == rowlen - 1 && ax2 == collen - 1) {
					return curr;
				} else {
					for (int k = 0; k < adj1.length; k++) {
						int x = ax1 + adj1[k];
						int y = ax2 + adj2[k];
						queue.add(new QueueNode(new Point(x, y), curr + 1));
					}
				}

			}

		}
		return -1;
	}

	public static boolean isValid(int i, int j, int[][] grid, int[][] visited) {
		if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == 0 && visited[i][j] == 0) {
			return true;
		}
		return false;
	}

}
