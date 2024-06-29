package Dp;
public class InterleavingString {
    public static void main(String[] args){
    }
    private boolean check(String s1, String s2, String s3, int i, int j, int k, Boolean[][] memo) {
        if (k == s3.length()) {
            return true;
        }
        
        if (memo[i][j] != null) {
            return memo[i][j];
        }
        
        boolean isValid = false;
        
        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
            isValid = check(s1, s2, s3, i + 1, j, k + 1, memo);
        }
        
        if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
            isValid = isValid || check(s1, s2, s3, i, j + 1, k + 1, memo);
        }
        
        memo[i][j] = isValid;
        return isValid;
    }
}
