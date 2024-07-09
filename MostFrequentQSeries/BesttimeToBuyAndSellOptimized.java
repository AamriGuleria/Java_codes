package MostFrequentQSeries;
import java.util.*;
public class BesttimeToBuyAndSellOptimized {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            minprice=java.lang.Math.min(minprice,prices[i]);
            maxprofit=java.lang.Math.max(maxprofit,prices[i]-minprice);
        }
        System.out.println(maxprofit);
    }
}
