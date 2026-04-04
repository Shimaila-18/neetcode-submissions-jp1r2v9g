class Solution {
    public int maxProfit(int[] prices) {
        int min = 0;
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[min]){
                min = i;
            }else {
            int profit =prices[i]-prices[min];
            if(profit > maxprofit){
                maxprofit=profit;
            }
            }
        }
        return maxprofit;
    }
}
