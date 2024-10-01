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
    public String addSpacesBruteForce2(String s, int[] spaces) {
        String newstr="";
        int pointer=0;
        for(int i=0;i<spaces.length;i++){
            newstr=newstr+s.substring(pointer,spaces[i])+" ";
            pointer=spaces[i];
        }
        return newstr+s.substring(pointer);
    }
}
