package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MHT {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        List<Integer> ans = new ArrayList<>();
        int n=4;
        int[][] edges={{3,1},{1,0},{1,2}};
        for (int i = 0; i <= n; i++) {
            int val = build(i, edges, 0, 0, new HashSet<>());
            if (val < min) {
                min = val;
                ans.clear();
                ans.add(i);
            } else if (val == min) {
                ans.add(i);
            }
        }
        
    }
    public static int contains(int[] edge,int n){
        for(int i=0;i<edge.length;i++){
            if(edge[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static int build(int n, int[][] edges, int h, int ind, HashSet<Integer> visited) {
        if (ind >= edges.length || visited.contains(n)) {
            return h;
        }
        visited.add(n);

        int maxHeight = h;
        for (int i = 0; i < edges.length; i++) {
            int idx = contains(edges[i], n);
            if (idx != -1) {
                int nextNode = edges[i][1 - idx];
                if (!visited.contains(nextNode)) {
                    maxHeight = Math.max(maxHeight, build(nextNode, edges, h + 1, 0, visited));
                }
            }
        }
        return maxHeight;
    }
    public static int build2(int n, int[][] edges, int h, int ind, HashSet<Integer> visited) {
        if (ind >= edges.length) {
            return h;
        }

        int i = contains(edges[ind], n);
        if (i != -1 && !visited.contains(edges[ind][1 - i])) {
            visited.add(edges[ind][1 - i]);
            return build(edges[ind][1 - i], edges, h + 1, 0, visited);
        } else {
            return build(n, edges, h, ind + 1, visited);
        }
    }
}
