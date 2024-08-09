package Tree;
import java.util.*;
public class BST2 {
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
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        build(new TreeNode(0),arr);
    }
    public static void build(TreeNode root,ArrayList<Integer> arr){ // 1 2 3
        if(arr.size()==0){
            System.out.println("hello");
            return;
        }
        for(int i:arr){
            if(i>root.val){
                root.right=new TreeNode(i);
                arr.remove(i);
                build(root.right,arr);
                arr.add(i);
            }
            if(i<root.val){
                root.left=new TreeNode(i);
                arr.remove(i);
                build(root.left,arr);
                arr.add(i);
            }
        }

    }
}
