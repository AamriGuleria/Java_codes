public class KthDistinctStringinanArray {
    public String kthDistinct(String[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            if(find(arr,arr[i])){
                k--;
            }
            if(k==0){
                return arr[i];
            }
        }
        return "";
    }
        public static boolean find(String[] arr, String s) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) {
                count++;
            }
        }
        return count == 1;
    }
}
