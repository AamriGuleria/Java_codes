import java.util.ArrayList;

public class MaxTwinSumOfLinkedList {
     public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public int pairSum(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        int i=0;
        int n=arr.size();
        int max=Integer.MIN_VALUE;
        while(i<=n/2-1){
            max=Math.max(max,arr.get(i)+arr.get(n-i-1));
            i++;
        }
        return max;
    }
}
