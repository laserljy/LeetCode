public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int curMax = 0;
        for(int i = 1; i < prices.length; i++) {
            int temp = prices[i] - prices[i - 1];
            max = max + temp > 0 ? max + temp : 0;
            curMax = curMax > max ? curMax : max;
        }
        return curMax;
    }
}