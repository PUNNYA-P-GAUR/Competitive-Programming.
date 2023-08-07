class Solution {
    public int countOdds(int low, int high) {
        int counter=high-low+1;
        int ans=0;
        if(high%2!=0 && low%2!=0){
            ans=counter/2+1;
        }else{
        ans=counter/2;}
        return ans;
    }
}