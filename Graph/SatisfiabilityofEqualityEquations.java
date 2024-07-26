package Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class SatisfiabilityofEqualityEquations {
    private HashSet<Character> findSet(ArrayList<HashSet<Character>> list, char c) {
        for (HashSet<Character> set : list) {
            if (set.contains(c)) {
                return set;
            }
        }
        return null; // Character not found in any set
    }

    public boolean equationsPossible(String[] equations) {
        ArrayList<HashSet<Character>> list = new ArrayList<>();
        
        // First pass: process '==' equations
        for (String s : equations) {
            char a = s.charAt(0);
            char b = s.charAt(3);
            if (s.charAt(1) == '=') {
                HashSet<Character> setA = findSet(list, a);
                HashSet<Character> setB = findSet(list, b);
                
                if (setA == null && setB == null) {
                    // Both characters are not in any set, create a new set
                    HashSet<Character> newSet = new HashSet<>();
                    newSet.add(a);
                    newSet.add(b);
                    list.add(newSet);
                } else if (setA == null) {
                    // Only setB exists, add character a to setB
                    setB.add(a);
                } else if (setB == null) {
                    // Only setA exists, add character b to setA
                    setA.add(b);
                } else if (setA != setB) {
                    // Both sets exist and are different, merge them
                    setA.addAll(setB);
                    list.remove(setB);
                }
            }
        }

        // Second pass: process '!=' equations
        for (String s : equations) {
            char a = s.charAt(0);
            char b = s.charAt(3);
            if (s.charAt(1) == '!') {
                HashSet<Character> setA = findSet(list, a);
                HashSet<Character> setB = findSet(list, b);
                
                if (setA != null && setB != null && setA == setB) {
                    return false; // Characters in the same set but expected to be different
                }
                if (a == b) {
                    return false; // Character cannot be different from itself
                }
            }
        }
        
        return true;
    }
}
