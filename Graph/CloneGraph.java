package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
    private Map<Node, Node> visited = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        
        // If the node was already visited before, return the clone from the visited dictionary.
        if (visited.containsKey(node)) {
            return visited.get(node);
        }
        
        // Create a clone for the given node.
        Node cloneNode = new Node(node.val, new ArrayList<>());
        
        // The key is the original node and the value is the clone node.
        visited.put(node, cloneNode);
        
        // Iterate through the neighbors to generate their clones and prepare a list of cloned neighbors.
        for (Node neighbor : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }
        return cloneNode;
    }
}
