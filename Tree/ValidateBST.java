package Tree;
public class ValidateBST {
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
    public static boolean validate(TreeNode node,Integer min, Integer max){
        if (node == null) {
        return true;
    }
    if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
        return false;
    }
}}
