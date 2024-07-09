package MostFrequentQSeries;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateOptimized {
    public static void main(String[] args) {
        
    }
    public static boolean check(int[]nums){
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }
}
