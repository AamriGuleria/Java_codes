package MostFrequentQSeries;

public class SearchInRoatedSortedArray {
    public static void main(String[] args) {
        
    }
    public static int optimized(int[] nums,int target){
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                return nums[i];
            }
        }
        return nums[0];
    }
}
