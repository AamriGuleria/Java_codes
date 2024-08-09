package Tree;

import java.util.List;

public class MaxDepth {
    class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        return depth(root,1);
    }
    public static int depth(Node root,int lv){
        if(root==null){
            return lv;
        }
        int max=lv;
       for(Node child:root.children){
        max=Math.max(max,depth(child,lv+1));
       }
       return max;
    }
}
