class Solution {
    public int[] getConcatenation(int[] nums) {
        int a=nums.length;
        int[] arr=nums;
        int b=arr.length;
        int c=a+b;
        int[] res=new int[c];
        int pos=0;
        for(int ele:nums){
            res[pos]=ele;
            pos++;
        }
        for(int ele:arr){
            res[pos]=ele;
            pos++;
        }
        return res;

    }
}