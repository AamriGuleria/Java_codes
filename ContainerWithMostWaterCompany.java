public class ContainerWithMostWaterCompany {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=0;
        while(left<right){
            ans=Math.max(ans,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right]){
                left++;
            }
            else if(height[right]<height[left]){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        return ans;
    }

}
