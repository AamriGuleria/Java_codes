package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RightViewOfTree{
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
         public static void right(TreeNode root,HashMap<Integer,Integer> hm,int lv){
        if(root==null){
            return;
        }
        hm.put(lv,root.val);
        right(root.left,hm,lv+1);
        right(root.right,hm,lv+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        right(root,hm,0);
        for(int i:hm.values()){
            ans.add(i);
        }
        return ans;
    }
        public static void main(String[] args) {
            
        }
    }