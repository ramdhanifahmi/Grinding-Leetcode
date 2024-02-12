class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestPrice = Integer.MAX_VALUE;
        
        for(int i=0; i < prices.length; i++){
            if(prices[i] < lowestPrice){
                lowestPrice = prices[i];
            } else if(prices[i] - lowestPrice > maxProfit){
                maxProfit = prices[i] - lowestPrice;
            }
        }
        
        return maxProfit;
        
    }
}