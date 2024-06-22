import java.util.ArrayList;
import java.util.HashMap;

public class PopulatingNextRightPointers {
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
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Node>> hm = new HashMap<>();
        traverse(root, hm, 0);
        for (ArrayList<Node> levelNodes : hm.values()) {
            for (int i = 0; i < levelNodes.size() - 1; i++) {
                levelNodes.get(i).next = levelNodes.get(i + 1);
            }
        }
    }
    public static void traverse(Node root, HashMap<Integer, ArrayList<Node>> hm, int lv) {
        if (root == null) {
            return;
        }
        hm.putIfAbsent(lv, new ArrayList<>());
        hm.get(lv).add(root);
        traverse(root.left, hm, lv + 1);
        traverse(root.right, hm, lv + 1);
    }
}
