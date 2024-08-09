package Tree;

public class FlipEqBinaryTree {
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
    public static boolean swap(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null){
            return true;
        }
        if(r1==null || r2==null || r1.val!=r2.val){
            return false;
        }
       return (swap(r1.left, r2.left) && swap(r1.right, r2.right)) ||
           (swap(r1.left, r2.right) && swap(r1.right, r2.left));
    }
}
