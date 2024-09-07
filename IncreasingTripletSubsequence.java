public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int first=Integer.MAX_VALUE;
        int sec=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=first){
                first=num;
            }
            else if(num<=sec){
                sec=num;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
