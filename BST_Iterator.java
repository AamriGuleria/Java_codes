/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
class BST_Iterator {
    ArrayList<Integer> values;
    int index;
    public BSTIterator(TreeNode root) {
        values = new ArrayList<>();
        index = 0;
        inorder(root);
    }
    
    public int next() {
        return values.get(index++);
    }
    
    public boolean hasNext() {
        return index < values.size();
    }
    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        values.add(node.val);
        inorder(node.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
