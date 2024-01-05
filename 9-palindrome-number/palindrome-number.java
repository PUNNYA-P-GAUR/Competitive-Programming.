class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        while(x>0){
            int n=x%10;
            rev=rev*10+n;
             x=x/10;
        }
        if(x<0){
            return false;
        }
        if(temp==rev){
            return true;
        }
        return false;
        
    }
}