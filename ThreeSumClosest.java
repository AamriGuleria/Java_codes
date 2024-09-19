import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int diff=Integer.MAX_VALUE;
        int value=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int a=i+1;
            int b=nums.length-1;
            while(a<b){
                int sum=nums[i]+nums[b]+nums[a];
                int d=Math.abs(sum-target);
                if(d<diff){
                    diff=Math.abs(sum-target);
                    value=sum;
                }
                else if(d==0){
                    return sum;
                }
                if(sum<target){
                    a++;
                }
                else{
                    b--;
                }
            }
        }
        return value;
    }
}
