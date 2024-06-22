import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class FlattenBinaryTreeToLinkedList {
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
    public void flatten(TreeNode root) {
        if(root!=null){
        ArrayList<TreeNode> al=new ArrayList<>();
        convert(root,al);
        TreeNode current = root;
        for (int i = 1; i < al.size(); i++) {
            current.left = null;
            current.right = al.get(i);
            current = current.right;
        }
        }}
    public static void convert(TreeNode n,ArrayList<TreeNode> al){
        if(n==null){
            return;
        }
        al.add(n);
        convert(n.left,al);
        convert(n.right,al);
    }
}
