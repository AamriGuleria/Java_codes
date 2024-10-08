public class LongerContiguousSegmentsofOnesthanZeros {
    public boolean checkZeroOnes(String s) {
        int zeroes=countZeroes(s);
        int ones=countOnes(s);
        return ones > zeroes;
    }
    public static int countZeroes(String s){
        int max=0;
        int tmp=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                tmp++;
            }
            else if(ch!='0' && tmp!=0){
                max=Math.max(max,tmp);
                tmp=0;
            }
        }
        max = Math.max(max, tmp);
        return max;
    }
    public static int countOnes(String s){
        int max=0;
        int tmp=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                tmp++;
            }
            else if(ch!='1' && tmp!=0){
                max=Math.max(max,tmp);
                tmp=0;
            }
        }
        max = Math.max(max, tmp);
        return max;
    }
}
