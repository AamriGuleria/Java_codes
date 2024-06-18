import javax.swing.tree.TreeNode;

public class IsSubtree {
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
        //code to find if subtree present in a tree
    }
    public static boolean run(TreeNode root,TreeNode subRoot){
        if (root == null) {
            return false;
        }
        if (isIdentical(root, subRoot)) {
            return true;
        }
        return run(root.left, subRoot) || run(root.right, subRoot);
    }
    public static boolean isIdentical(TreeNode root, TreeNode sub) {
        if (root == null && sub == null) {
            return true;
        }
        if (root == null || sub == null) {
            return false;
        }
        if (root.val != sub.val) {
            return false;
        }
        return isIdentical(root.left, sub.left) && isIdentical(root.right, sub.right);
    }
}
