package Tree;

public class Max_depth {
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
        
    }
    public static int max_depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=max_depth(root.left)+1;
        int right=max_depth(root.right)+1;
        return Math.max(left,right);
    }
}
