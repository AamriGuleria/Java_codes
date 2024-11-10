import java.util.Arrays;

public class Sorting{
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 13, 9, 3};
        int sm = Integer.MAX_VALUE;  // Initialize with a large value
        int larg = Integer.MIN_VALUE;  // Initialize with a small value

        // Find the smallest and largest prime numbers
        for (int i = 0; i < arr.length; i++) {
            if (prime(arr[i])) {
                if (arr[i] < sm) {
                    sm = arr[i];
                }
                if (arr[i] > larg) {
                    larg = arr[i];
                }
            }
        }

        // Create a new array and place smallest and largest prime
        int[] narr = new int[arr.length];
        narr[0] = sm;
        narr[arr.length - 1] = larg;
        int j = 1;

        // Sort the array and fill other elements
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != sm && arr[i] != larg) {
                narr[j] = arr[i];
                j++;
            }
        }

        display(narr);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {  // Optimization for prime checking
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}