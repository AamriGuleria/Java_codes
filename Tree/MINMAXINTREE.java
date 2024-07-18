package Tree;
public class MINMAXINTREE{
    class Node {
        int data;
        Node left, right;
        
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        
    }
    public static int findMax(Node root){
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int left = findMax(root.left);
        int right = findMax(root.right);
        return Math.max(root.data, Math.max(left, right));
    }
    public static int findMin(Node root){
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int left = findMin(root.left);
        int right = findMin(root.right);
        return Math.min(root.data, Math.min(left, right));
    }
}