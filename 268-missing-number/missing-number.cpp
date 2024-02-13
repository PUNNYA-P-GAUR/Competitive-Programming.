class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int i=0;
        sort(nums.begin(),nums.end());
        for(int j=0;j<nums.size();j++){
            if(nums[j]!=i){
                return i;
            }
            i++;
        }
        return nums.size();

        
    }
};