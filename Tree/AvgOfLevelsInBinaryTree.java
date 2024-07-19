package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
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
    public static List<Double> using_BFS(TreeNode root){
        List<Double> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double sum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                sum += currentNode.val;

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            result.add(sum / levelSize);
        }

        return result;
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
