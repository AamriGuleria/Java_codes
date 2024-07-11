package MostFrequentQSeries;
import java.util.*;
public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        
    }
    public static int optimized(int[] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                return nums[i];
            }
        }
        return nums[0];
    }
    public static int BruteForce(int[] nums){
        Arrays.sort(nums);
        return nums[0];
    }
}
