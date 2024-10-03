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
    public int[] pivotArrayOptimized(int[] nums, int pivot) {
        int n=nums.length;
        int[] result=new int[n];
        int smaller=0;
        int pivotCount=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                smaller++;
            }
            else if(nums[i]==pivot){
                pivotCount++;
            }
        }
        int larger=n-(pivotCount+smaller);
        int lessIndex=0;
        int pivotIndex=smaller;
        int greaterIndex=smaller+pivotCount;
        for(int num:nums){
            if(num<pivot){
                result[lessIndex++]=num;
            }
            else if(num==pivot){
                result[pivotIndex++]=num;
            }
            else{
                result[greaterIndex++]=num;
            }
        }
        return result;
    }
}
