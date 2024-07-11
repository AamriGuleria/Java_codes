package MostFrequentQSeries;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ThreeSum {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate values for i

            int a = i + 1;
            int b = nums.length - 1;

            while (a < b) {
                int sum = nums[i] + nums[a] + nums[b];
                if (sum > 0) {
                    b--;
                } else if (sum < 0) {
                    a++;
                } else {
                    // Create a new triplet
                    List<Integer> triplet = Arrays.asList(nums[i], nums[a], nums[b]);

                    if (!uniqueTriplets.contains(triplet)) {
                        uniqueTriplets.add(triplet);
                        ans.add(triplet);
                    }
                    // Move both pointers to avoid duplicates
                    while (a < b && nums[a] == nums[a + 1]) a++;
                    while (a < b && nums[b] == nums[b - 1]) b--;
                    a++;
                    b--;
                }
            }
        }
        return ans;
}
    public static List<List<Integer>> BruteForce(int[] nums){
        Arrays.sort(nums);
     List<List<Integer>> ans=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                if(nums[i]+nums[j]+nums[k]==0){
                    ArrayList<Integer> tmp=new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[k]);
                    if(!ans.contains(tmp)){
                    ans.add(tmp);
                    }
                }
            }
        }
     }
     return ans;
    }
}
