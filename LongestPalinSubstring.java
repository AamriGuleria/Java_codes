import java.util.*;
public class LongestPalinSubstring {
    public String longestPalindrome(String s) {
        if(palindrome(s)){
            return s;
        }
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String tmp=s.substring(i,j+1);
                if(palindrome(tmp) && !arr.contains(tmp)){
                    arr.add(tmp);
                }
            }
        }
            Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Compare based on length
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println(arr);
        if(arr.size()==0){
            return String.valueOf(s.charAt(0));
        }
        return arr.get(arr.size()-1);
    }
    public static boolean palindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
