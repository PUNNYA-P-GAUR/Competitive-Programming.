class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i=0;
        int j=i+1;
        while(j<nums.size()){
            if(nums[i]==nums[j]){j++;}
            else{
                int temp=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
        }
        return i+1;
        
    }
};