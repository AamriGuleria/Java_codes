package Tree;

public class IsSame {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int key){
            val=key;
            left=right=null;
        }
    }
    public static boolean isSame(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }
}
