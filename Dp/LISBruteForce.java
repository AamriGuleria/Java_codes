public class LISBruteForce {
    public static int find(int[] nums,int curr,int prev) {
        if(curr==nums.length){
         return 0;
        }
        //taking
        int take=0;
        if(prev==-1 ||nums[curr]>nums[prev]){
         take=1+find(nums,curr+1,curr);
        }
        int nottake=0+find(nums,curr+1,prev);
        return java.lang.Math.max(take,nottake);
     }
}
