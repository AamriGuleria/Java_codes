package Tree;
public class PathSum3 {
     public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
             this.right = right;
             }
         }
    int final_ans = 0; // To store the count of paths that sum to the target value
    
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        path_sum2(root, 0, targetSum);   // Check for paths starting from the current node
        pathSum(root.left, targetSum);   // Check for paths starting from the left child
        pathSum(root.right, targetSum);  // Check for paths starting from the right child
        return final_ans;
    }
    public void path_sum2(TreeNode root, long sum, int targetSum) {
        if (root == null) {
            return;
        }
        sum += root.val;
        if (sum == targetSum) {
            final_ans++;
        }
        // Continue to search for paths in the left and right subtrees
        path_sum2(root.left, sum, targetSum);
        path_sum2(root.right, sum, targetSum);
    }
}
