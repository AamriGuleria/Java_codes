import java.util.*;
public class PatternMatch {
    public static void main(String[] args) {
        String[] words={"uexk","aeuexkf","wgxih","yuexk","gxea","yuexkm","ypmfx","jjuexkmb","wqpri","aeuexkfpo","kqtnz","pkqtnza","nrbb","hmypmfx","krqs","jjuexkmbyt","zvru","ypmfxj"};
        ArrayList<String> ls=new ArrayList<>();
        String c="";
        for(String s:words){
            c+=s;
        }
        for (String word : words) {
            for (String candidate : words) {
                if (!word.equals(candidate) && candidate.contains(word)) {
                    ls.add(word);
                    break; // No need to check further once we find a match
                }
            }
        }
        System.out.println(ls);
    }
}

