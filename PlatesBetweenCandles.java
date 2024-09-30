public class PlatesBetweenCandles {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int[] ans = new int[queries.length];
        
        for (int k = 0; k < queries.length; k++) {
            // Extract the relevant substring based on the query
            String sub = s.substring(queries[k][0], queries[k][1] + 1);
            ans[k] = count(sub);
        }
        return ans;
    }
    public static int count(String s) {
        int ans = 0;
        int i = 0;
        int j = s.length() - 1;

        // Move i to the first candle from the left
        while (i < j && s.charAt(i) != '|') {
            i++;
        }

        // Move j to the first candle from the right
        while (j > i && s.charAt(j) != '|') {
            j--;
        }

        // Check if valid candles are found
        if (i < j) {
            // Count plates between the candles
            for (int k = i + 1; k < j; k++) {
                if (s.charAt(k) == '*') {
                    ans++;
                }
            }
        }

        return ans;
    }
}
