package Dp;

public class CountSubArraysWithFixedBounds {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;
        int lastMaxK=-1;
        int lastMinK=-1;
        int leftBound=-1;
        long count = 0;
        for(int i=0;i<nums.length;i++){
            if (nums[i] < minK || nums[i] > maxK) {
                leftBound = i; 
            }
            if (nums[i] == minK) {
                lastMinK = i; 
            }
            if (nums[i] == maxK) {
                lastMaxK = i; 
            }
            if (lastMinK != -1 && lastMaxK != -1) {
                count += Math.max(0, Math.min(lastMinK, lastMaxK) - leftBound);
            }
        }
    }
}
