package Tree;

public class BSTTOGST {
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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        if(root!=null){
        bstToGst(root.right);
        sum=sum+root.val;
        root.val=sum;
        bstToGst(root.left);
        }
        return root;
    }
}