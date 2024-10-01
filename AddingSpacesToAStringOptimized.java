public class AddingSpacesToAStringOptimized {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder newstr=new StringBuilder();
        int pointer=0;
        for(int i=0;i<spaces.length;i++){
            newstr.append(s,pointer,spaces[i]).append(" ");
            pointer=spaces[i];
        }
        newstr.append(s.substring(pointer));
        return newstr.toString();
    }
}
