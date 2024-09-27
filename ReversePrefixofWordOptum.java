public class ReversePrefixofWordOptum {
    public String reversePrefix(String word, char ch) {
        int ind=word.indexOf(ch);
        if(ind!=-1){
            String sub=word.substring(ind+1);
            return rev(word.substring(0,ind+1))+sub;
        }
        else{
            return word;
        }
    }
    public static String rev(String s){
        String st="";
        for(int i=s.length()-1;i>=0;i--){
            st+=s.charAt(i);
        }
        return st;
    }
}
