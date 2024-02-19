class Solution {
public:
    bool isPowerOfTwo(int n) {
       int x=0;
       while(pow(2,x)<n){
           x++;
        }
        return (pow(2,x)==n);
        
    }
};