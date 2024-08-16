package Tree;

public class SmallestStringStartingFromLeaf {
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
    private String traverse(TreeNode node, String path) {
        if (node == null) {
            return null;
        }
        
        // Add current node's character to the path
        path = (char) ('a' + node.val) + path;
        
        // If it's a leaf node, return the path
        if (node.left == null && node.right == null) {
            return path;
        }

        // Recursively find the smallest path in both subtrees
        String leftPath = traverse(node.left, path);
        String rightPath = traverse(node.right, path);

        // Return the smaller path (ignoring null paths)
        if (leftPath == null) return rightPath;
        if (rightPath == null) return leftPath;
        return leftPath.compareTo(rightPath) < 0 ? leftPath : rightPath;
    }
}
