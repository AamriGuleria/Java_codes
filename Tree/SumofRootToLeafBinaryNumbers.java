package Tree;

public class SumofRootToLeafBinaryNumbers {
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
    public static int public_sum=0;
    public int sumRootToLeaf(TreeNode root) {
        return root_to_leaf(root,"");
    }
    public static int root_to_leaf(TreeNode root,String bin){
        if(root==null){
            return 0;
        }
        bin += root.val;
        if(root.left==null && root.right==null){
            return Integer.parseInt(bin, 2);
        }
        return root_to_leaf(root.left,bin)+root_to_leaf(root.right,bin);
    }
}
