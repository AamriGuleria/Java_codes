package MostFrequentQSeries;

import java.util.HashMap;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int k=3;
        System.out.println(check(nums,k));
    }
    public static boolean check(int[] nums,int k){
        HashMap<Integer,Integer> seen=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(seen.containsKey(nums[i]) && java.lang.Math.abs(seen.get(nums[i])-i)<=k){
                return true;
            }
            seen.put(nums[i],i);
        }
        return false;
    }
}
