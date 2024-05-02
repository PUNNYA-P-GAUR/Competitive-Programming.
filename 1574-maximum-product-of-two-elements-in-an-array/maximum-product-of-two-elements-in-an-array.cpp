class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int largest=0;
        int sec=0;
        for(int &i:nums){
            if(i>largest){
            sec=largest;
            largest=i;
            }
            else{
                sec=max(sec,i);
            }
        }
        int ans=(largest-1)*(sec-1);
        return ans;

        
    }
};