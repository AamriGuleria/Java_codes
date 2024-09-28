public class MinimumAverageDifference {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        long firstSum = 0;
        
        // Calculate the total sum of all elements
        for (int num : nums) {
            totalSum += num;
        }
        
        int minIndex = -1;
        long minDiff = Long.MAX_VALUE;
        
        // Traverse through the array and calculate average difference
        for (int i = 0; i < n; i++) {
            firstSum += nums[i]; // Increment first part sum
            long secondSum = totalSum - firstSum; // Remaining part sum
            
            // Calculate the average of the first part (i+1 elements)
            long firstAvg = firstSum / (i + 1);
            
            // Calculate the average of the second part (n-i-1 elements)
            long secondAvg = (i == n - 1) ? 0 : secondSum / (n - i - 1);
            
            // Calculate the absolute difference between averages
            long diff = Math.abs(firstAvg - secondAvg);
            
            // Update minimum difference and index if needed
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }
        
        return minIndex;
    }
}
