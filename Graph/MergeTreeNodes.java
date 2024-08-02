package Graph;

public class MergeTreeNodes {
     public static class TreeNode {
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return build(root1,root2);
    }
    public static TreeNode build(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
        return null;
    }
    int sum = 0;
    if (p != null) {
        sum = p.val;
    }
    if (q != null) {
        sum += q.val;
    }
    TreeNode newNode = new TreeNode(sum);
    newNode.left = build(p != null ? p.left : null, q != null ? q.left : null);
    newNode.right = build(p != null ? p.right : null, q != null ? q.right : null);
    return newNode;
}
}
