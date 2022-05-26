package AISD_HW.BuyAndSell;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) { return 0; }
        int max = 0;
        int min = prices[0];
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min) {
                min = prices[i];
            }
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }
}
