import java.util.ArrayList;

public class RearrangeArrayElementsbySign {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i:nums){
            if(i<0){
                odd.add(i);
            }
            else{
                even.add(i);
            }
        }
        int[] ans=new int[nums.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<even.size() && j<odd.size()){
            ans[k]=even.get(i);
            i++;
            k++;
            ans[k]=odd.get(j);
            j++;
            k++;
        }
        return ans;
    }
}
