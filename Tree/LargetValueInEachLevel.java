package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LargetValueInEachLevel {
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
    public List<Integer> largestValues(TreeNode root) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        ArrayList<Integer> fake=new ArrayList<>();
        traverse(root,hmap,0);
        for(int i:hmap.values()){
            fake.add(i);
        }
        return fake;
    }
    public static void traverse(TreeNode root,HashMap<Integer,Integer> hmap,int lv){
        if(root==null){
            return;
        }
        hmap.put(lv, Math.max(hmap.getOrDefault(lv, root.val), root.val));
        traverse(root.left,hmap,lv+1);
        traverse(root.right,hmap,lv+1);
    }
}
