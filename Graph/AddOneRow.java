package Graph;

public class AddOneRow {
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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode r=new TreeNode(val);
            r.left=root;
            return r;
        }
        build(root,val,depth);
        return root;
    }
    public static void build(TreeNode root,int val,int depth){
        if(root==null){
            return;
        }
        if(depth-2==0){
            if(root.left!=null){
            TreeNode left=root.left;
            root.left=new TreeNode(val);
            root.left.left=left;
            }
            else{
                root.left=new TreeNode(val);
            }
            if(root.right!=null){
            TreeNode right=root.right;
            root.right=new TreeNode(val);
            root.right.right=right;
            }
            else{
                root.right=new TreeNode(val);
            }
            return;
        }
        build(root.left,val,depth-1);
        build(root.right,val,depth-1);
    }
}
