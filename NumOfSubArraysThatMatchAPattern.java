import java.util.*;
public class NumOfSubArraysThatMatchAPattern {
    public static void main(String[] args) {
        int[] nums = {872500231,872500231,872500231,872500231};
        int[] pattern = {0};
        int subLen=pattern.length+1;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=sub2(nums,pattern,i,subLen);
        }
        System.out.println(ans);
    }
    public static int sub2(int[] arr,int[] pattern,int st,int subLen){
        if(st+subLen>arr.length){
            return 0;
        }
        int k=0;
        for(int i=st;i<st+subLen;i++){
            if(k==pattern.length){
                break;
            }
            if(pattern[k]==1 && arr[i]<arr[i+1] || pattern[k]==0 && arr[i]==arr[i+1] || pattern[k]==-1 && arr[i]>arr[i+1]){
                k++;
            }
            else{
                return 0;
            }
        }
        return 1;
    }

}
