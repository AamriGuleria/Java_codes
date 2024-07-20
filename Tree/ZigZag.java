package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZigZag {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> hmap=new HashMap<>();
        traverse(root,0,hmap);
        for(ArrayList<Integer> a:hmap.values()){
            l.add(a);
        }
        return l;
    }
    public static void traverse(TreeNode root,int lv,HashMap<Integer,ArrayList<Integer>> hm){
        if (root == null) {
            return;
        }
        ArrayList<Integer> list = hm.getOrDefault(lv, new ArrayList<>());
        if (lv % 2 == 0) {
            list.add(root.val);
        } else {
            list.add(0, root.val);
        }
        hm.put(lv, list);
        traverse(root.left, lv + 1, hm);
        traverse(root.right, lv + 1, hm);
    }
}
