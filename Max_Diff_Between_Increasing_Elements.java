public class Max_Diff_Between_Increasing_Elements {
    public static void main(String[] args) {
        
    }
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int diff=-1;
        for(int i=1;i<nums.length;i++){
            if (nums[i] > min) {
                diff = Math.max(diff, nums[i] - min);
            } else {
                min = nums[i];
            }
        }
        return diff;
    }
}
