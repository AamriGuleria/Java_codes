import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
             @Override
            public int compare(int[] a, int[] b) {
                // Compare based on the first element of each interval
                return Integer.compare(a[0], b[0]);
            }
        });
        List<int[]> arr=new ArrayList<>();
        int[] newint=intervals[0];
        arr.add(newint);
        for(int i=1;i<intervals.length;i++){
            int[] curr=intervals[i];
            if(curr[0]<=newint[1]){
                newint[1]=Math.max(newint[1],curr[1]);
            }
            else{
                newint=curr;
                arr.add(curr);
            }
        }
         return arr.toArray(new int[arr.size()][]);
}
}
