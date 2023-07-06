class Solution {
    public int longestSubarray(int[] nums) {
       int left=0;
        int right=0;
        int zero=0;
        int maxLength=0;

        while (right<nums.length) {
            if (nums[right]==0) {
                zero++;
            }

            while (zero>1) {
                if (nums[left]==0) {
                    zero--;
                }
                left++;
            }

            maxLength=Math.max(maxLength,right-left+1-1);
            right++;
        }

        return maxLength;

    }
}