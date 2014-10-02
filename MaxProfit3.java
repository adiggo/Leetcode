public class Solution {
    public int maxProfit(int[] prices) {
        //native idea is to find 0~i maxprofit and i~n maxprofit
    
        // same as the 2, but find the maximum two transaction if needed
        if (prices.length == 0 || prices == null || prices.length == 1){
            return 0;
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        int low = prices[0];
        int maxProfit = 0;
        for (int i = 1; i<prices.length; i++){
            
            if (maxProfit<prices[i]-low)
                maxProfit = prices[i]-low;
            if (prices[i]<low)
                low = prices[i];
            // add maxProfit into result
            result.add(maxProfit);
        }
        
        
        int highest = prices[prices.length-1]; 
        int finalResult = result.get(result.size()-1);
        int maxProfit2 = 0;
        for(int i = prices.length-2; i>=0;i--){
             if (maxProfit2 < (highest - prices[i]))
                maxProfit2 = highest - prices[i];
             if (prices[i]>highest)
                highest = prices[i];
             if (finalResult < maxProfit2+result.get(i-1))
                finalResult = maxProfit2+result.get(i-1);
        }
        return finalResult;
        
    }
}
