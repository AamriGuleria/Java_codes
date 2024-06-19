import java.util.*;
public class ArrayByConcatenatingOtherArrays {
    public static void main(String[] args) {
        int[][] groups = {{10,-2},{1,2,3,4}};// 1,-1,-1
        int[] nums = {1,2,3,4,10,-2};
        for(int[] i:groups){
            System.out.println(match(nums,i));
        }
    }
    public static boolean match(int[] arr, int[] sub) {
        int arrLen = arr.length;
        int subLen = sub.length;

        for (int i = 0; i <= arrLen - subLen; i++) {
            if (isSubarray(arr, sub, i)) {
                markSubarray(arr, subLen, i);
                return true;
            }
        }
        return false;
    }
    public static boolean isSubarray(int[] arr, int[] sub, int start) {
        for (int i = 0; i < sub.length; i++) {
            if (arr[start + i] != sub[i]) {
                return false;
            }
        }
        return true;
    }

    public static void markSubarray(int[] arr, int subLen, int start) {
        for (int i = 0; i < start+subLen; i++) {
            arr[i] = -100;
        }
    }
}
