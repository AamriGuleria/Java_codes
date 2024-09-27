import java.util.Arrays;
import java.util.Comparator;

public class SubsequenceofLengthKWiththeLargestSum {
     public class Pair {
        int val;
        int ind;
        Pair(int val, int ind) {
            this.val = val;
            this.ind = ind;
        }
    }

    public int[] maxSubsequence(int[] nums, int k) {
        // Create an array to hold pairs of value and index
        Pair[] pairs = new Pair[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new Pair(nums[i], i);
        }
        
        // Sort the pairs based on the value in descending order
        Arrays.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return Integer.compare(p2.val, p1.val); // Sort by value descending
            }
        });
        
        // Select the top k elements and sort them by index
        Pair[] topK = new Pair[k];
        for (int i = 0; i < k; i++) {
            topK[i] = pairs[i];
        }
        
        // Sort the top k elements based on their original index to maintain order
        Arrays.sort(topK, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return Integer.compare(p1.ind, p2.ind); // Sort by index ascending
            }
        });
        
        // Extract the values from the sorted pairs
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK[i].val;
        }
        
        return result;
    }
}
