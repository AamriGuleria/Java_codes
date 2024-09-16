public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }

        // If there are remaining elements in nums1
        while (i < nums1.length) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        // If there are remaining elements in nums2
        while (j < nums2.length) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        // Find the median
        if (merged.length % 2 != 0) {
            return (double) merged[merged.length / 2];
        } else {
            int mid1 = merged.length / 2 - 1;
            int mid2 = merged.length / 2;
            return (merged[mid1] + merged[mid2]) / 2.0; // Ensure floating-point division
        }
    }
}
