package Tree;

import java.util.PriorityQueue;

public class KthLargestElementInTheStream {
    private PriorityQueue<Integer> minHeap;
    int k=0;
    public void KthLargest(int k, int[] nums) {
       this.k = k;
        this.minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (val > minHeap.peek()) {
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
}

