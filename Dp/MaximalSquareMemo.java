package Dp;

import java.util.Arrays;

public class MaximalSquareMemo {
    public static void main(String[] args) {
        String[][] matrix = {{"1","0","1","0","0"},{"1","0","1","1","1"},{"1","1","1","1","1"},{"1","0","0","1","0"}};
        int ans=0;
        int[][] memo=new int[matrix.length][matrix[0].length];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j].equals("1")){
                    ans=java.lang.Math.max(search(matrix,i,j,memo),ans);
                }
            }
        }
    }
    public static int search(String[][] matrix,int i,int j,int[][]memo){
        if (i >= matrix.length || j >= matrix[0].length || matrix[i][j].equals("0")) {
            return 0;
        }
        
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        int right = search(matrix, i, j + 1, memo);
        int down = search(matrix, i + 1, j, memo);
        int diag = search(matrix, i + 1, j + 1, memo);
        
        memo[i][j] = java.lang.Math.min(java.lang.Math.min(right, down), diag) + 1;
        
        return memo[i][j];
    }
}
