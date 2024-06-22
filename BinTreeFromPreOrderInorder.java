import java.util.*;
import java.util.List;
public class BinTreeFromPreOrderInorder {
    public static class TreeNode {
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
        int[] preorder={3,9,20,15,7};//9,20,15,7
         int[] inorder={9,3,15,20,7};
         TreeNode root=new TreeNode(preorder[0]);
         List<Integer> pre=new ArrayList<>();
         List<Integer> in=new ArrayList<>();
         for(int i=0;i<preorder.length;i++){
            pre.add(preorder[i]);
            in.add(inorder[i]);
         }
         int ind=in.indexOf(preorder[0]);
         List<Integer> left=in.subList(0, ind);
         List<Integer> right=in.subList(ind+1, in.size());
         build(root, left, right, pre);
    }
    public static void build(TreeNode root,List<Integer> left,List<Integer> right,List<Integer> preorder){
        if(left.isEmpty() && right.isEmpty()){
            return;
        }
        for(int i=0;i<preorder.size();i++){
            if(left.contains(preorder.get(i))){
                int val=preorder.get(i);
                root.left=new TreeNode(val);
                preorder.remove(i);
                if(!left.isEmpty()){
                int ind=left.indexOf(val);
                build(root.left,left.subList(0, ind),left.subList(ind+1,left.size()),preorder);
                break;
                }
                
            }
        }
        for(int i=0;i<preorder.size();i++){
            if(right.contains(preorder.get(i))){
                int val=preorder.get(i);
                root.right=new TreeNode(val);
                preorder.remove(i);
                if(!right.isEmpty()){
                int ind=right.indexOf(val);
                build(root.right,right.subList(0, ind),right.subList(ind+1,left.size()),preorder);
                break;
                }
                
            }
        }
    }
}
