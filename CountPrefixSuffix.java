public class CountPrefixSuffix {
    public static void main(String[] args) {
        String[] words={"a","aba","ababa","aa"};
        int count=0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                    if (isPrefix(words[i], words[j])) {
                        count++;
                    }
            }
        }
        System.out.println(count);
    }
    public static boolean isPrefix(String s1,String s2){
        return s2.startsWith(s1) && s2.endsWith(s1);
    }
}
