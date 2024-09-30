public class PlatesBetweenCandlesOptimized {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] prefixPlates = new int[n];
        int[] leftCandles = new int[n];
        leftCandles[0]=(s.charAt(0)=='|')?0:-1;
        prefixPlates[0]=0;
        for (int i = 1; i < n; i++) {
            prefixPlates[i]=prefixPlates[i-1]+ (s.charAt(i) == '*' ? 1 : 0);
            if (s.charAt(i) == '|') {
                leftCandles[i] = i;
            } else {
                leftCandles[i] = leftCandles[i -1];
            }
        }
        int[] rightCandles = new int[n];
        rightCandles[n - 1] = (s.charAt(n - 1) == '|') ? n - 1 : -1;
        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                rightCandles[i] = i;
            } else {
                rightCandles[i] = rightCandles[i + 1];
            }
        }

        // Process each query
        int[] ans = new int[queries.length];
        for (int k = 0; k < queries.length; k++) {
            int left = queries[k][0];
            int right = queries[k][1];
            int leftIndex = rightCandles[left];
            int rightIndex = leftCandles[right];

            // Check if we have valid candles and leftIndex < rightIndex
            if (leftIndex != -1 && rightIndex != -1 && leftIndex < rightIndex) {
                ans[k] = prefixPlates[rightIndex] - prefixPlates[leftIndex];
            } else {
                ans[k] = 0; // No valid plates between candles
            }
        }
        return ans;
    }
}
