package Tree;

public class SumOfLeafNodes {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int key){
            data=key;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        
    }
    public int SumofLeafNodes(Node root)
    {
        // your code here
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return root.data;
        }
        return 0+SumofLeafNodes(root.left)+SumofLeafNodes(root.right);
    }
}
