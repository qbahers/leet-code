/**
 * Time:  O(n)
 * Space: O(1)
 */

public class BestTimeToBuyAndSellStockII {
    
    public int maxProfit(int[] prices) {
        int res = 0;
        
        for (int i = 1; i < prices.length; i++)
            res += Math.max(0, prices[i] - prices[i - 1]);
        
        return res;
    }
    
}