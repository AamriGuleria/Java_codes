import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Four_Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //Brute Force Approach
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1 ; k<nums.length;k++){
                    for(int l=k+1;l<nums.length;l++){
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                            ArrayList<Integer> tmp=new ArrayList<>();
                            tmp.add(nums[i]);
                            tmp.add(nums[j]);
                            tmp.add(nums[k]);
                            tmp.add(nums[l]);
                            Collections.sort(tmp);
                            if(!list.contains(tmp)){
                                list.add(tmp);
                            }
                        }
                    }
                }
            }
        }
        return list;
    }
}
