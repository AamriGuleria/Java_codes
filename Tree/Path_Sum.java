package Tree;

public class Path_Sum {
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
    public static boolean path_sum(TreeNode root,int targetSum){
        if(root==null){
            return false;
        }
        if (root.left == null && root.right == null) {
        return targetSum == root.val;
    }
    return path_sum(root.left, targetSum - root.val) || path_sum(root.right, targetSum - root.val);
    }
}
