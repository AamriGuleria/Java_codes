public class MoveAllBallsInCurrentIndex {
    public int[] minOperations(String boxes) {
        int[] ans=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int k=Bcount(boxes,i);
            ans[i]=k;
        }
        return ans;
}
public static int Bcount(String boxes,int ind){
    int count=0;
    for(int i=0;i<boxes.length();i++){
        if(i==ind){
            continue;
        }
        if(boxes.charAt(i)=='1'){
            count=count+Math.abs(i-ind);
        }
    }
    return count;
}
}
