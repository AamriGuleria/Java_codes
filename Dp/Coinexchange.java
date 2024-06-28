package Dp;

public class Coinexchange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amt = 11;
        int[] dp=new int[amt+1];
        dp[0]=0;
        for(int i=1;i<amt+1;i++){
            dp[i]=amt+1;
        }
        for(int i=1;i<dp.length;i++){
            for(int coin:coins){
                if(i-coin>=0){
                    dp[i]=java.lang.Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        System.out.println(dp[amt]>amt?-1:dp[amt]);
    }
}
