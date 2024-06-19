public class WordInPrefixOfAnySentence {
    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        String[] arr=sentence.split(" ");
        for(String s:arr){
            if(s.substring(0,searchWord.length()).equals(searchWord)){
                
            }
        }
    }
}
