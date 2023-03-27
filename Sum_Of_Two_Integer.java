class Solution {
    public int getSum(int a, int b) {
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        return getSum(2*(a&b),a^b);
    }
}
//https://assets.leetcode.com/users/images/c2e91add-95d5-44ef-8dc1-85d0e25219ad_1620502855.803335.png
