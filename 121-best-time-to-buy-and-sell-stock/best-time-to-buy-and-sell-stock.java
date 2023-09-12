class Solution {
    public int maxProfit(int[] arr) {
        int maxp=0;
        int minp=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            minp=Math.min(minp,arr[i]);
            maxp=Math.max(arr[i]-minp,maxp);
        }
        return maxp;
        
    }
}