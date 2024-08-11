package Tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
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
    List<Integer> r1 = new ArrayList<>();
    List<Integer> r2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        count(root1,r1);
        count(root2,r2);
        return r1.equals(r2);
    }
    public static void count(TreeNode root,List<Integer> r){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            r.add(root.val);
            return;
        }
        count(root.left,r);
        count(root.right,r);
    }
}
