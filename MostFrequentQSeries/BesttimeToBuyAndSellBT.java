package MostFrequentQSeries;
public class BesttimeToBuyAndSellBT {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int diff=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                    diff=java.lang.Math.max(diff,prices[j]-prices[i]);
            }
        }

    }
}
