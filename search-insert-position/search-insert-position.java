class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int pivot = low + (high - low)/2;
        while (low <= high){
            if (target == nums[pivot])
                return pivot;
            else if (target > nums[pivot])
                low = pivot + 1;
            else
                high = pivot - 1;
            pivot = low + (high - low)/2;
        }
        return low;
    }
}