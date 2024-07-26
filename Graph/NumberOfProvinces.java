package Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class NumberOfProvinces {
    private HashSet<Integer> findSet(ArrayList<HashSet<Integer>> list, int c) {
        for (HashSet<Integer> set : list) {
            if (set.contains(c)) {
                return set;
            }
        }
        return null; // Character not found in any set
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<HashSet<Integer>> list=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
              for(int j=0;j<isConnected[0].length;j++){
                if(i==j){
                    continue;
                }
                if(isConnected[i][j]==1){
                HashSet<Integer> setA = findSet(list, i);
                HashSet<Integer> setB = findSet(list, j);
                if (setA == null && setB == null) {
                    // Both characters are not in any set, create a new set
                    HashSet<Integer> newSet = new HashSet<>();
                    newSet.add(i);
                    newSet.add(j);
                    list.add(newSet);
                } else if (setA == null) {
                    // Only setB exists, add character a to setB
                    setB.add(i);
                } else if (setB == null) {
                    // Only setA exists, add character b to setA
                    setA.add(j);
                } else if (setA != setB) {
                    // Both sets exist and are different, merge them
                    setA.addAll(setB);
                    list.remove(setB);
                }
                }
              }
        }
         // To account for isolated nodes
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (HashSet<Integer> set : list) {
                if (set.contains(i)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                HashSet<Integer> newSet = new HashSet<>();
                newSet.add(i);
                list.add(newSet);
            }
        }

        return list.size();
    }
}
