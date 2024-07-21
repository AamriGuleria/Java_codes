package Tree;
public class SortedArrayToBST {
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
    public static void makeTree(int[] nums,int start,int end,TreeNode root){
        if(start>end){
          return;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]<root.val){
          root.left=new TreeNode(nums[mid]);
          root=root.left;
      }
      else{
          root.right=new TreeNode(nums[mid]);
          root=root.right;
      }
      makeTree(nums,start,mid-1,root);
      makeTree(nums,mid+1,end,root);
  }
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid=nums.length/2;
        TreeNode root=new TreeNode(nums[mid]);
        makeTree(nums,0,mid-1,root);
        makeTree(nums,mid+1,nums.length-1,root);
        return root;
    }
}
