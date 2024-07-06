import java.util.Arrays;

public class LISMemo {
    public static void main(String[] args) {
        int[] nums={1,3,5,4,7};
        int[][] dp=new int[nums.length][nums.length+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        find2(nums,0,-1,dp);
    }
    public static int find2(int[] nums,int curr,int prev,int[][] dp) {
        if(curr==nums.length){
         return 0;
        }
        if(dp[curr][prev+1]!=-1){
         return dp[curr][prev+1];
        }
        //taking
        int take=0;
        if(prev==-1 ||nums[curr]>nums[prev]){
         take=1+find2(nums,curr+1,curr,dp);
        }
        int nottake=0+find2(nums,curr+1,prev,dp);
        return dp[curr][prev+1]=java.lang.Math.max(take,nottake);
     }
}
