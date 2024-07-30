package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightPointer {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
    
        public Node() {}
        
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public static void bfs(Node root) {
    if (root == null) return;
    
    Queue<Node> q = new LinkedList<>();
    q.offer(root);
    
    while (!q.isEmpty()) {
        int size = q.size(); // Size of the current level
        for (int i = 0; i < size; i++) {
            Node current = q.poll(); // Get and remove the front element
            if (i < size - 1) {
                current.next = q.peek(); // Set next pointer to the next node in the queue
            } else {
                current.next = null; // Last node in the level
            }
            
            // Add children to the queue
            if (current.left != null) {
                q.offer(current.left);
            }
            if (current.right != null) {
                q.offer(current.right);
            }
        }
    }
}

}
