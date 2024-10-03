public class PartitionArrayPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] relIndex=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                relIndex[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                relIndex[k]=pivot;
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                relIndex[k]=nums[i];
                k++;
            }
        }
        return relIndex;
    }
}
