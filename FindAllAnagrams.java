import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int n=p.length();
        if (s.length() < p.length())
            return ans;
        for(int i=0;i<s.length()-n+1;i++){
            if(isAnagram(s.substring(i,i+n),p)){
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean isAnagram(String s, String t) {
        char[] a1=s.toCharArray();
        char[] a2=t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }
}
