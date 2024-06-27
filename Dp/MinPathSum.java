package Dp;

public class MinPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] dp=new int[grid.length][grid[0].length];
       dp[0][0]=grid[0][0];
       for(int i=1;i<dp.length;i++){
        dp[i][0]=grid[i][0]+dp[i-1][0];
       }
       for(int i=1;i<dp[0].length;i++){
        dp[0][i]=grid[0][i]+dp[0][i-1];
       }
       fill(dp,grid);
       return dp[dp.length-1][dp[0].length-1];
    }
    public static void display(int[][] dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void fill(int[][] dp,int[][] grid){
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j]=java.lang.Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
    }
}
