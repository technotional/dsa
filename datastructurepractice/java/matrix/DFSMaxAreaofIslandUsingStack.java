package com.example.datastructurepractice.java.matrix;

import java.util.Stack;

public class DFSMaxAreaofIslandUsingStack {

	
	public static void main(String[] args) {
		int[][] arr = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
					   {0,0,0,0,0,0,0,1,1,1,0,0,0},
					   {0,1,1,0,1,0,0,0,0,0,0,0,0},
					   {0,1,0,0,1,1,0,0,1,0,1,0,0},
					   {0,1,0,0,1,1,0,0,1,1,1,0,0},
					   {0,0,0,0,0,0,0,0,0,0,1,0,0},
					   {0,0,0,0,0,0,0,1,1,1,0,0,0},
					   {0,0,0,0,0,0,0,1,1,0,0,0,0}};
		
		System.out.println(max_area(arr.length, arr[0].length, arr));
	}
	
	 public static class Point{
	        int p1;
	        int p2;
	        
	        Point(int x, int y){
	            p1 = x;
	            p2 = y;
	        }
	    }
	    
	    public static int max_area(int m, int n, int[][] arr) {
	    
	        int areaMax = 0;
	        int[][] visited = new int[m][n];
	        int[] adjx = {-1, 1, 0, 0};
	        int[] adjy = {0, 0, -1, 1};
	        Stack<Point> stk = new Stack<Point>();
	        
	         
	        for(int i=0; i<m; i++){
	            for(int j=0; j<n; j++){
	                if(arr[i][j] == 1){
	                    stk.push(new Point(i,j));
	                    int area = calculateArea(stk,arr, visited, adjx, adjy);
	                    areaMax = Math.max(areaMax, area);
	                }
	            }
	        }
	        return areaMax;
	    }
	    
	    public static int calculateArea(Stack<Point> stk, int[][] arr, int[][] visited, int[] adj1, int[] adj2){
	        int area = 0;
	        while(!stk.isEmpty()){
	               Point point = stk.pop(); 
	               int ix = point.p1;
	               int iy = point.p2;
	            
	            if(isValid(ix, iy, arr, visited)){
	               visited[ix][iy] = 1;
	               area++;
	               for(int i=0; i<adj1.length; i++){
	                   int x = ix + adj1[i];
	                   int y = iy + adj2[i];
	                   stk.push(new Point(x, y));
	               }
	            } 
	        }
	        return area;
	    }

	    public static boolean isValid(int i, int j, int[][] arr, int[][] visited){
	        if(i>=0 && j>=0 && i<arr.length && j<arr[0].length && arr[i][j] == 1 && visited[i][j] == 0){
	            return true;
	        }
	        return false;
	    }
}
