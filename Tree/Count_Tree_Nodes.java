package Tree;

public class Count_Tree_Nodes {
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
    public static int count(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }
}
