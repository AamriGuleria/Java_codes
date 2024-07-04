package Dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class KWithSmallestSum {
    public static void main(String[] args) {
        
    
    int[] nums1 = {1,7,11};
        int[] nums2 = {2,4,6};
        int k = 3;
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]); // idx1, idx2, sum
        pq.add(new int[] { 0, 0, (nums1[0] + nums2[0]) });
        Set<String> set = new HashSet<>();
        set.add(0 + "," + 0);
        List<List<Integer>> ans = new ArrayList<>();

        while(k-->0 && pq.size() > 0){
            int[] peek=pq.remove();
            int i = peek[0];
            int j = peek[1];
            ans.add(Arrays.asList(nums1[i], nums2[j]));

            if (i + 1 < nums1.length && !set.contains((i + 1) + "," + j)) {
                set.add((i + 1) + "," + j);
                pq.add(new int[] { i + 1, j, nums1[i + 1] + nums2[j] });
            }
            if (j + 1 < nums2.length && !set.contains(i + "," + (j + 1))) {
                set.add(i + "," + (j + 1));
                pq.add(new int[] { i, j + 1, nums1[i] + nums2[j + 1] });
            }
        }
        //ans
    }
}
