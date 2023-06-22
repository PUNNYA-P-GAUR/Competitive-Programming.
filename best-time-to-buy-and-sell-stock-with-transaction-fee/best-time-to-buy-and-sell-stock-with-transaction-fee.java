class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[] sell =new int[prices.length];
        int[] wait=new int[prices.length];
        wait[0]=-prices[0];
        for(int i=1;i<prices.length;i++){
            wait[i] = Math.max(wait[i - 1], sell[i - 1] - prices[i]);
            sell[i] = Math.max(sell[i - 1], wait[i - 1] + prices[i] - fee);
        }
        
        
        return sell[prices.length-1];

    }
}