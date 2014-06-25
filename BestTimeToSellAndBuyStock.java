public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int len = prices.length;
        int maxProfit = 0;
        for(int i = 1; i < len; i++){
            int tempProfit = prices[i] - prices[i-1];
            if(maxProfit < tempProfit){
                maxProfit = tempProfit;
            }
            if(min > prices[i]){
                min = prices[i];
            }
        }
        return maxProfit;
    }
}