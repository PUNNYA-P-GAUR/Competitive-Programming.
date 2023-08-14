class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int ans=0;
        while(i<=n){
            n=n-i;
            i++;
            ans++;
        }
        return ans;
    }
}