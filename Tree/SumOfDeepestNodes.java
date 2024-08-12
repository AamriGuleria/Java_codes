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
            int maxdepth=getMaxDepth(root);
            return findsum(root,maxdepth,0);
        }
        private int getMaxDepth(TreeNode node) {
            if (node == null) return 0;
            return 1 + Math.max(getMaxDepth(node.left), getMaxDepth(node.right));
        }
        public static int findsum(TreeNode root,int maxdepth,int currdepth){
            if(root==null){
                return 0;
            }
            if(currdepth==maxdepth-1){
                return root.val;
            }
            return findsum(root.left,maxdepth,currdepth+1)+
            findsum(root.right,maxdepth,currdepth+1);
        }
    // public int deepestLeavesSum(TreeNode root) {
    //     HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
    //     count(root,hm,0);
    //     int maxKey = Collections.max(hm.keySet());
    //     int sum=0;
    //     for(int i:hm.get(maxKey)){
    //         sum+=i;
    //     }
    //     return sum;
    // }
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
