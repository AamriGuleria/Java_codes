package Dp;

public class LongestPalinSubsequence {
    public static void main(String[] args) {
        
    }
    public static int lps(String s){
        StringBuilder str=new StringBuilder(s);
        String st=str.reverse().toString();
        int m=s.length();
        int n=st.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<n;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==st.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=java.lang.Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
