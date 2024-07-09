package MostFrequentQSeries;
import java.util.ArrayList;
import java.util.Arrays;

public class ContainsDuplicateBF {
    public static void main(String[] args) {
        int[] nums={1,1,1,3,3,4,3,2,4,2};

    }
    public static boolean check2(int[] nums){
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
    public static boolean check(int[] nums){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:nums){
            if(arr.contains(i)){
                return true;
            }
            arr.add(i);
        }
        return false;
    }
}
