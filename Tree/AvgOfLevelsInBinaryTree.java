package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AvgOfLevelsInBinaryTree {
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
    public static void mapping(TreeNode root, HashMap<Integer, ArrayList<Integer>> arr, int lv) {
        if (root == null) {
            return;
        }
        arr.putIfAbsent(lv, new ArrayList<>());
        arr.get(lv).add(root.val);
        mapping(root.left, arr, lv + 1);
        mapping(root.right, arr, lv + 1);
    }
    public List<Double> averageOfLevels(TreeNode root) {
        HashMap<Integer,ArrayList<Integer>> arr=new HashMap<>();
        mapping(root,arr,0);
        List<Double> ans=new ArrayList<>();
        for (int i : arr.keySet()) {
            double sum = 0.0;
            ArrayList<Integer> tmp = arr.get(i);
            for (int j : tmp) {
                sum += j;
            }
            ans.add(sum / tmp.size());
        }
        return ans;
    }
}
