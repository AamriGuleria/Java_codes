package Dp;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthOfPairChain {
    public static class PairComparator implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            return a[1] - b[1];
        }
    }
    public static void main(String[] args) {
        int[][] pairs = {{1,2},{2,3},{3,4}};// 1,2 4,5 7,8
        int[] count=new int[pairs.length];
        Arrays.fill(count, 1);
        Arrays.sort(pairs, new PairComparator());
        for(int i=1;i<pairs.length;i++){
            for(int j=0;j<i;j++){
                if(pairs[i][0]>pairs[j][1]){
                    count[i]++;
                }
            }
        }
        int max=0;
        for(int i=0;i<count.length;i++){
            // System.out.println(pairs[i][0]+" "+pairs[i][1]);
            max=java.lang.Math.max(max,count[i]);
        }
    }
}
