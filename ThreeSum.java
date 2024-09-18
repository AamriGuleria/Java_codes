import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // -4 -1 -1 0 1 2 
    Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int a = i + 1;
            int b = nums.length - 1;
            while (a < b) {
                int sum = nums[i] + nums[a] + nums[b];
                if(sum>0){
                    b--;
                }
                else if(sum<0){
                    a++;
                }
                else{
                    List<Integer> triplet = Arrays.asList(nums[i], nums[a], nums[b]);
                    if (!uniqueTriplets.contains(triplet)) {
                    uniqueTriplets.add(triplet);
                    ans.add(triplet);
                    while (a < b && nums[a] == nums[a + 1]) a++;
                    while (a < b && nums[b] == nums[b - 1]) b--;
                    a++;
                    b--;
                    }
                 }
            }
        }
        return ans;
    }
}
