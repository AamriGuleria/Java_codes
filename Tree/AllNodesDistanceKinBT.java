package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AllNodesDistanceKinBT {
     public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        populateParents(root, null, parentMap);
        List<Integer> ans=new ArrayList<>();
        find(root, k,target ,ans,parentMap);
        
        return ans;
    }
    private void populateParents(TreeNode node, TreeNode parent, Map<TreeNode, TreeNode> parentMap) {
        if (node == null) {
            return;
        }
        if (parent != null) {
            parentMap.put(node, parent);
        }
        populateParents(node.left, node, parentMap);
        populateParents(node.right, node, parentMap);
    }
    public static List<Integer> find(TreeNode root,int k,TreeNode target,List<Integer> ans,Map<TreeNode, TreeNode> parentMap){
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(target);
        int curr_level=0;
        Set<TreeNode> vis = new HashSet<>();
        vis.add(target);
        while(q.size()!=0 && curr_level<=k){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr_level==k){
                    ans.add(curr.val);
                }
                if(curr.left!=null && !vis.contains(curr.left)){
                    q.offer(curr.left);
                    vis.add(curr.left);
                }
                if(curr.right!=null && !vis.contains(curr.right)){
                    q.offer(curr.right);
                    vis.add(curr.right);
                }
                if (parentMap.containsKey(curr) && !vis.contains(parentMap.get(curr))) {
    q.offer(parentMap.get(curr));
    vis.add(parentMap.get(curr));
}

            }
            curr_level++;
        }
        return ans;
    }
}
