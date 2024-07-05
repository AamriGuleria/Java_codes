import java.util.HashMap;
import java.util.Map;

public class LongestArithmeticSum {
    public static void main(String[] args) {
        int[] arr={1,5,7,8,5,3,4,2,1};
        int difference=-2;
        Map<Integer, Integer> dp = new HashMap<>();
        int maxLength = 0;
        for (int num : arr) {
            int prev = num - difference;
            int length = dp.getOrDefault(prev, 0) + 1;
            dp.put(num, length);
            maxLength = java.lang.Math.max(maxLength, length);
        }
        // int[] dp=new int[arr.length];
        // Arrays.fill(dp,1);
        // for(int i=1;i<arr.length;i++){
        //     for (int j = 0; j < i; j++) {
        //         if (arr[i] - arr[j] == difference) {
        //             dp[i] = java.lang.Math.max(dp[i], dp[j] + 1);
        //         }
        //     }
        // }
        // for(int i:dp){
        //     System.out.print(i+" ");
        }
        // int maxLength = 1;
        // for (int i = 0; i < dp.length; i++) {
        //     maxLength = Math.max(maxLength, dp[i]);
        // }
    }

