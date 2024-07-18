package Tree;

public class LCA {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int key){
            val=key;
            left=right=null;
        }
    }
    public static TreeNode LCA(TreeNode root,TreeNode p,TreeNode q){
        if(root==null || root==p ||root==q){
            return root;
        }
        TreeNode left=LCA(root.left,p,q);
        TreeNode right=LCA(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        else{
            return left==null?right:left;
        }
    }
}
