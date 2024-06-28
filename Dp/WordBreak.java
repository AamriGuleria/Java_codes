package Dp;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
        String s = "catsandog";
        String[] wordDict = {"cats","dog","sand","and","cat"};
        Set<String> wordSet = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];
        System.out.println(help(wordSet, 0,s, memo));
    }
    public static boolean help(Set<String> words,int start,String s,Boolean[] dp){
        if(start==s.length()){
            return true;
        }
        if (dp[start] != null) {
            return dp[start];
        }
        for(int end=start+1;end<=s.length();end++){
            if(words.contains(s.substring(start,end)) && help(words,end,s,dp)){
                dp[start]=true;
                return true;
            }
        }
        dp[start]=false;
        return dp[start];
    }
}
