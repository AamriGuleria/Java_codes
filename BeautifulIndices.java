import java.util.ArrayList;

public class BeautifulIndices {
    public static void main(String[] args) {
        String s="rinzbrrr";
        String a = "nzb";
        String b = "r";
        int  k = 2;
        ArrayList<Integer> ans = match(s, a);
        ArrayList<Integer> bns = match(s, b);
        if (bns.isEmpty()) {
            System.out.println("No such value");
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int index : ans) {
            for (int bIndex : bns) {
                if (java.lang.Math.abs(bIndex - index) <= k) {
                    result.add(index);
                    break;
                }
            }
        }

        System.out.println(result);
    }
    public static ArrayList<Integer> match(String s,String a){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<s.length()-a.length()+1;i++){
            if(s.substring(i,i+a.length()).equals(a)){
                al.add(i);
            }
        }
        return al;
    }
}
