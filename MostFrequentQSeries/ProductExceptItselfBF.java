package MostFrequentQSeries;

public class ProductExceptItselfBF {
    public static void main(String[] args) {
        
    }
    public static int[] optimized(int[] nums){
        int[] arr=new int[nums.length];
        int z=0;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            prod*=nums[i];
            }
            else{
                z++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0 && z>0){
            arr[j]=0;
            }
            else if(nums[j]==0){
                if(z==1){
                    arr[j]=prod;
                }
                else if(z>1){
                    arr[j]=0;
                }
            }
            else{
                arr[j]=prod/nums[j];
            }
        }
        return arr;
    }
    public static int[] BruteForce(int[] nums){
        int[] arr=new int[nums.length];
        int prod1=1;
        int prod2=1;
        for(int i:nums){
            if(prod1==0 && i==0){
                prod2=0;
                break;
            }
            if(i==0){
                prod1=0;
                continue;
            }
            prod1*=i;
            prod2*=i;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[i]=prod2;
            }
            else{
                arr[i]=prod1/nums[i];
            }
        }
        return arr;
    }
}
