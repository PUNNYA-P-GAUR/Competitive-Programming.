class Solution {
public:
    bool isPalindrome(int x) {
        bool ans=false;
        if(x<0){return ans;}
        long  temp=x;
       long  rev=0;
        while(x>0){
            int dig=x%10;
            rev=(rev*10)+dig;
            x=x/10;
        }
        if(temp==rev){ans=true;}
        return ans;
    }
};