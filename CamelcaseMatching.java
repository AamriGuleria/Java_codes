import java.util.*;
public class CamelcaseMatching{
    public static void main(String[] args) {
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String  pattern = "FoBaT";
        ArrayList<Boolean> ans = camelMatch(queries, pattern);
        System.out.println(ans);
    }
    public static ArrayList<String> break_words(String pattern){
        ArrayList<String> al = new ArrayList<>();
        String tmp = "";
        for (int i = 0; i < pattern.length(); i++) {
            if (Character.isUpperCase(pattern.charAt(i)) && tmp.length() != 0) {
                al.add(tmp);
                tmp = "";
            }
            tmp += pattern.charAt(i);
        }
        if (tmp.length() != 0) {
            al.add(tmp);
        }
        return al;
    }
    public static boolean isMatch(String query, String pattern) {
        int i = 0; // pointer for pattern
        for (int j = 0; j < query.length(); j++) {
            if (i < pattern.length() && query.charAt(j) == pattern.charAt(i)) {
                i++;
            } else if (Character.isUpperCase(query.charAt(j))) {
                return false;
            }
        }
        return i == pattern.length();
    }
    public static ArrayList<Boolean> camelMatch(String[] queries, String pattern) {
        ArrayList<Boolean> ans = new ArrayList<>();
        for (String query : queries) {
            ans.add(isMatch(query, pattern));
        }
        return ans;
    }
}