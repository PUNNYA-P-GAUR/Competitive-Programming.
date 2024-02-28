class Solution {
public:
    int majorityElement(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        //int x=nums.size();
        return nums[nums.size()/2];
        
    }
};