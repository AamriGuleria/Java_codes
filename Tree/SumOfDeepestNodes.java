package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SumOfDeepestNodes {
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
    public int deepestLeavesSum(TreeNode root) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        count(root,hm,0);
        int maxKey = Collections.max(hm.keySet());
        int sum=0;
        for(int i:hm.get(maxKey)){
            sum+=i;
        }
        return sum;
    }
    public static void count(TreeNode root,HashMap<Integer,ArrayList<Integer>> hm,int lv){
        if(root==null){
            return;
        }
        hm.putIfAbsent(lv, new ArrayList<Integer>());
        hm.get(lv).add(root.val);
        count(root.left,hm,lv+1);
        count(root.right,hm,lv+1);

    }
}
