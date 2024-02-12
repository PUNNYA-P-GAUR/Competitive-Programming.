class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit=0;
        int loss=INT_MAX;
        for(int i=0;i<prices.size();i++){
            loss=min(loss,prices[i]);
            profit=max(prices[i]-loss,profit);
        }
        return profit;
        
    }
};