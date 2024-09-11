public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String ans = "";  // Store the longest palindrome
        int n = s.length();
        String[][] matrix = new String[n][n];  // DP matrix to store substrings

        // Initialize the matrix for single characters
        for (int i = 0; i < n; i++) {
            matrix[i][i] = String.valueOf(s.charAt(i));  // Single characters
            if (matrix[i][i].length() > ans.length()) {
                ans = matrix[i][i];  // Initialize ans with any single character palindrome
            }
        }
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<matrix.length;j++){
            String temp=matrix[i][j-1]+s.charAt(j);
            matrix[i][j]=temp;
            if (palindrome(matrix[i][j]) && matrix[i][j].length() > ans.length()) {
                    ans = matrix[i][j];  // Update ans if we find a longer palindrome
                }
        }
        }
        return ans;
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
