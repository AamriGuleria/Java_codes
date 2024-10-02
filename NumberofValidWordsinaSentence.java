public class NumberofValidWordsinaSentence {
    public int countValidWords(String sentence) {
        int lastSpace=-1;
        int countValid=0;
        sentence=sentence.trim();
        sentence=sentence+" ";
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                String tmp=sentence.substring(lastSpace+1,i);
                 System.out.println(tmp); 
                if(!tmp.isEmpty() && validate(tmp)){
                    System.out.println(sentence.substring(lastSpace+1,i));
                    countValid++;
                }
                lastSpace=i;
            }
        }
        return countValid;
    }
    public static boolean validate(String word) {
        boolean hasHyphen = false;
        boolean hasPunctuation = false;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Check for digits
            if (Character.isDigit(ch)) {
                return false;  // Invalid word if it contains digits
            }

            // Hyphen validation
            if (ch == '-') {
                if (hasHyphen || i == 0 || i == word.length() - 1 || 
                    !Character.isLetter(word.charAt(i - 1)) || 
                    !Character.isLetter(word.charAt(i + 1))) {
                    return false;  // Hyphen rules: only one, and must be between two letters
                }
                hasHyphen = true;
            }

            // Punctuation validation
            if (ch == '!' || ch == '.' || ch == ',') {
                if (i != word.length() - 1) {
                    return false;  // Punctuation can only be at the end
                }
                hasPunctuation = true;
            }

            // Ensure valid characters (letters, hyphen, and punctuation)
            if (!Character.isLetter(ch) && ch != '-' && ch != '!' && ch != '.' && ch != ',') {
                return false;  // Invalid if it contains any other characters
            }
        }
        return true;  // Return true if the word is valid
    }
}
