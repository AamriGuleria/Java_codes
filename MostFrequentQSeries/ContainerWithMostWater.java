package MostFrequentQSeries;

public class ContainerWithMostWater {
    public static void main(String[] args){
        
    }
    public int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int val=Math.min(height[i],height[j])*(j-i);
                max=Math.max(max,val);
            }
        }
        return max;
    }
    public int usingTwoPointers(int[] height){
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            max=Math.max(max,Math.min(height[left],height[right])*(right-left));
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
        return max;
    }
}
