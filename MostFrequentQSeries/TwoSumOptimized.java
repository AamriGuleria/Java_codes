package MostFrequentQSeries;
import java.util.HashMap;

public class TwoSumOptimized {
    public static void main(String[] args) {
        
    }
    public static int[] check(int[] nums,int target){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(hm.containsKey(complement)){
                return new int[]{i,hm.get(complement)};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
