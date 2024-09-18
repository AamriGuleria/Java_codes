import java.util.*;
public class TwoSum2{
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<numbers.length;i++){
            if(hm.containsKey(target-numbers[i])){
                ans[0]=hm.get(target-numbers[i])+1;
                ans[1]=i+1;
                break;
            }
            else{
                hm.put(numbers[i],i);
            }
        }
        return ans;
        }
}