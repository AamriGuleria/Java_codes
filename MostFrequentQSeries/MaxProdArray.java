package MostFrequentQSeries;

public class MaxProdArray {
    public static void main(String[] args) {
        
    }
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
            for (int i = 1; i < nums.length; i++) {
            // If the current number is negative, swap the maxProduct and minProduct
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
    
            // Update maxProduct and minProduct
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);
    
            // Update the result
            result = Math.max(result, maxProduct);
        }
    
        return result;
        }
}
