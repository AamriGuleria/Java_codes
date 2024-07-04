import java.util.*;
import java.util.List;

public class KWithSmallestSumBruteForce {
    public static void main(String[] args){
        int[] nums1 = {1,2,4,5,6};
        int[] nums2 = {3,5,7,9};
        int k = 3;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[2]-a[2]);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(pq.size()<k){
                    pq.add(new int[]{nums1[i],nums2[j],nums1[i]+nums2[j]});
                }
                else{
                    if(nums1[i]+nums2[j]<pq.peek()[2]){
                        pq.remove();
                        pq.add(new int[]{nums1[i],nums2[j],nums1[i]+nums2[j]});
                    }
                }
            }
        }
        while (!pq.isEmpty()) {
            int[] pair = pq.poll();
            System.out.println("Pair: (" + pair[0] + ", " + pair[1] + "), Sum: " + pair[2]);
        }
    }
}
