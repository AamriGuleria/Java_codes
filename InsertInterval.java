import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> arr=new ArrayList<>();
        arr.add(newInterval);
        for(int[] i:intervals){
            arr.add(i);
        }
        Collections.sort(arr,new Comparator<int[]>(){
             @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
    List<int[]> merged = new ArrayList<>();
    int[] prev = arr.get(0);
    for (int i = 1; i < arr.size(); i++) {
        int[] curr = arr.get(i);
        if (curr[0] <= prev[1]) {
            prev[1] = Math.max(prev[1], curr[1]);
        } else {
            merged.add(prev);
            prev = curr;
        }
    }
    merged.add(prev);
    return merged.toArray(new int[merged.size()][]);
    }
}
