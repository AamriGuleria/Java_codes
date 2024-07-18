package Tree;

public class GoodNodes {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int key){
            val=key;
            left=right=null;
        }
    }
    public int findmax(TreeNode root,int max){
        if(root==null){
            return 0;
        }
        if(root.val>=max){
            max=root.val;
            return 1+findmax(root.left,max)+findmax(root.right,max);
        }
        else{
            return 0+findmax(root.left,max)+findmax(root.right,max);
        }
    }
    public static void main(String[] args) {
        
    }
}
