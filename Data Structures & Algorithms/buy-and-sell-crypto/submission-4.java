class Solution {
    public int maxProfit(int[] prices) {
        int curr=0;
        int max=0;
        for(int i=1;i<prices.length;i++){
            curr = Math.max(0,curr+prices[i]-prices[i-1]);
            max = Math.max(curr,max);
        }
        return max;
    }
}
