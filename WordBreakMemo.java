import java.util.*;
public class WordBreakMemo{
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];
        return check(s, wordSet, 0,memo);
    }
    public static boolean check(String s , Set<String> wordSet, int start, Boolean[] memo){
        if(start==s.length()){
            return true;
        }
        if(memo[start]!=null){
            return memo[start];

        }
        for (int end = start + 1; end <= s.length(); end++) {
        if (wordSet.contains(s.substring(start, end)) && check(s, wordSet, end,memo)) {
            memo[start]=true;
                return true;
            }
        }
        memo[start]=false;
        return false;
    }
}