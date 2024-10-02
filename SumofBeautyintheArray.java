public class SumofBeautyintheArray {
    public int sumOfBeauties(int[] nums) {
        int sum=0;
        int n=nums.length;
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];
        leftMax[0]=nums[0];
        rightMax[n-1]=nums[n-1];
        for(int i=1;i<nums.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.min(rightMax[i+1],nums[i]);
        }
        for(int i=1;i<n-1;i++){
            if (leftMax[i-1] < nums[i] && nums[i] < rightMax[i+1]) {
                sum += 2;
}
            else if(nums[i-1] < nums[i] && nums[i+1]>nums[i]){
                sum+=1;
            }
        }
        return sum;
}
}
