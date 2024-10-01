public class AddingSpacestoaString {
    public String addSpaces(String s, int[] spaces) {
        int k=0;
        String newstr="";
        for(int i=0;i<s.length();i++){
            if(k<spaces.length && i==spaces[k]){
                newstr=newstr+" "+s.charAt(i);
                k++;
            }
            else{
                newstr=newstr+s.charAt(i);
            }
        }
        return newstr;
    }
}
