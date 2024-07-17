package Tree;

import java.util.List;

import javax.swing.tree.TreeNode;

public class Preorder {
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
    public static void Preorder(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        ans.add(root.val);
        Preorder(root.left,ans);
        Preorder(root.right,ans);
    }
}
