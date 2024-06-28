package Dp;

public class Fib{
    public static void main(String[] args) {
        
    }
    public int fib(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        if(n==0){
            return dp[n];
        }
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}