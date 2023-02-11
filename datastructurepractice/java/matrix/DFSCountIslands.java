package com.example.datastructurepractice.java.matrix;

public class DFSCountIslands {
  
	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 1, 0, 1 }, 
						{ 0, 0, 0, 0, 0 },
						{ 0, 1, 1, 1, 0 }, 
						{ 1, 1, 1, 1, 0 },
						{ 1, 1, 1, 1, 1 }, 
						{ 0, 0, 0, 0, 0 } };;
		System.out.println(numIslands(arr));
	}
	
public static int numIslands(int[][] grid) {
        
        int rowlen = grid.length;
        int collen = grid[0].length;
        int[][] vis = new int[rowlen][collen];
        int islands = 0;
        int[] adjx = {-1,-1,-1,0,0,1,1,1};
        int[] adjy = {-1,0,1,-1,1,-1,0,1};
        for(int i=0; i<rowlen; i++){
            for(int j=0; j<collen; j++){
                if(isValid(i, j, grid, vis)){
                     vis[i][j]=1;
                     markIsland(i, j, adjx, adjy, grid, vis);
                     islands++;
                }
            }
        }
        return islands;
    }

    public static void markIsland(int i, int j, int[] adjx, int[] adjy, int[][] gridarry, int[][] vis){
        	vis[i][j] = 1;
            for(int m=0; m<adjx.length; m++){
                    int p = i + adjx[m];
                    int q = j + adjy[m];
                     if(isValid(p, q, gridarry, vis)){
                         markIsland(p, q, adjx, adjy, gridarry, vis);
                     }
                }

        }
    
    public static boolean isValid(int i, int j, int[][] gridarry, int[][] vis){
         int rowlen = gridarry.length;
         int collen = gridarry[0].length;
        if(i>=0 && j>=0 && i<rowlen && j<collen && gridarry[i][j]==1 && vis[i][j]==0){
            return true;
        }
        return false;
    }
}
