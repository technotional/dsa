package com.example.datastructurepractice.java.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFSMaxAreaOfIsland {

	public static void main(String[] args) {
		int[][] arr = {{1,0}};
		
		System.out.println(maxAreaOfIsland(arr));
	}
	
	public static int maxAreaOfIsland(int[][] grid) {
        int rowlen = grid.length;
        int collen = grid[0].length;
        int[][] vis = new int[rowlen][collen];
        int max = 0;
        for(int i=0; i<rowlen; i++){
            for(int j=0; j<collen; j++){
                max = Math.max(area(i, j, rowlen, collen, grid, vis), max);
            }
        }
        return max;
    }

    public static int area(int i, int j, int rowlen, int collen, int[][] grid, int[][] vis){

        if(i>=0 && j>=0 && i<rowlen && j<collen && grid[i][j]==1 && vis[i][j] == 0){
            vis[i][j] = 1;
            int res = 1 + area(i-1,j,rowlen, collen, grid, vis) + area(i,j-1,rowlen, collen, grid, vis) + area(i+1,j,rowlen, collen, grid, vis) + area(i,j+1,rowlen, collen, grid, vis);
            return res;
        }else{
            return 0;
        }
    }

}
