package MostFrequentQSeries;

public class MaxSubarraySum {
    public static void main(String[] args) {
        //optimized
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int max=nums[0];
        int cumsum=0;
        for(int i=0;i<nums.length;i++){
            cumsum+=nums[i];
            max=java.lang.Math.max(max,cumsum);
            if(cumsum<0){
                cumsum=0;
            }
        }
        System.out.println(max);
    }
}
