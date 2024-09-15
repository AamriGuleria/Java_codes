import java.util.*;
public class WordBreak {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        check(s, wordDict, 0, "", ans);
        return ans;
    }
        public static void check(String s, List<String> wordDict, int start, String cum, List<String> ans) {
        if (start == s.length()) {
            ans.add(cum.trim());
            return;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            String tmp = s.substring(start, end);
            if (wordDict.contains(tmp)) {
                check(s, wordDict, end, cum + tmp + " ", ans);
            }
        }
    }
}
