import java.util.Arrays;

public class EarnAndDelete {
    public static void main(String[] args) {
        
    }
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int[] ans=new int[nums[nums.length-1]+1];
        Arrays.fill(ans,0);
        int[] exc=new int[ans.length];
        int inc[]=new int[ans.length];
        Arrays.fill(exc,0);
        Arrays.fill(inc,0);
        for(int i:nums){
            ans[i]=ans[i]+1;
        }
        inc[0]=ans[0];
        exc[0]=0;
        for(int i=1;i<ans.length;i++){
            if(ans[i]==0){
                inc[i] = inc[i - 1]; // No occurrence of current number
                exc[i] = java.lang.Math.max(exc[i - 1], inc[i - 1]);
            }
            exc[i]=java.lang.Math.max(inc[i-1],exc[i-1]);
            inc[i]=ans[i]*i+exc[i-1];
        }
        return java.lang.Math.max(exc[ans.length-1],inc[ans.length-1]);
    }
}
