class Solution {
    public int maxProfit(int[] prices) {
        int sf=Integer.MAX_VALUE;
        int o=0;
        int pi=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<sf){
                sf=prices[i];
            }
            pi=prices[i]-sf;
            if(o<pi){
                o=pi;
            }
        }
        return o;
   }
}