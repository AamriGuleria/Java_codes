public class MinimizeDiffBetweenTargetAndChosenElement {
    public static int ans=Integer.MAX_VALUE;
    public int minimizeTheDifference(int[][] mat, int currSum) {
        ans=Integer.MAX_VALUE;
        backtrack(mat,currSum,0,0);
        return ans;
    }
    public static void backtrack(int[][] mat,int target,int row,int currSum){
        if(row>=mat.length){
            ans=Math.min(ans,Math.abs(currSum-target));
            return;
        }
        for(int j=0;j<mat[0].length;j++){
            backtrack(mat,target,row+1,currSum + mat[row][j]);
        }
    }
}
