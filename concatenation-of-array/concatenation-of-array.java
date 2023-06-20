class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=nums;
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=arr[i];

        // }
        int size=arr.length+nums.length;
        int pos=0;
        int[] res=new int[size];
        for(int ele:nums){
            
            res[pos]=ele;
            pos++;
        }
        for(int ele:arr){
            //int pos=0;
            res[pos]=ele;
            pos++;
        }
        return res;
    }
}