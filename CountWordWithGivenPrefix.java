public class CountWordWithGivenPrefix {
    public static void main(String[] args) {
        String [] words = {"pay","attention","practice","attend"};
         String pref = "at";
         int count=0;
         for(String i:words){
            if(i.substring(0,pref.length()).equals(pref)){
                count++;
            }
         }
    }
}
