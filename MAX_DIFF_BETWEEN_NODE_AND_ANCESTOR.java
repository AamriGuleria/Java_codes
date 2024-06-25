import javax.swing.tree.TreeNode;

public class MAX_DIFF_BETWEEN_NODE_AND_ANCESTOR {
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
    public static void main(String[] args) {
        return shortHelper(root, root.val, root.val);
    }
    private int shortHelper(TreeNode node, int max, int min) {
        if (node == null) {
            return max - min;
        }
        max = Math.max(max, node.val);
        min = Math.min(min, node.val);
        
        int left = shortHelper(node.left, max, min);
        int right = shortHelper(node.right, max, min);
        
        return Math.max(left, right);
    }
}
