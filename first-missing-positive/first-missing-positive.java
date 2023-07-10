class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=1;
        HashSet<Integer> s=new HashSet<>();
        for(int j=0;j<n;j++){
            s.add(nums[j]);
        }
        while(i<=n){
            if(s.contains(i)){
                i++;
            }
            else{
                return i;
            }
        }
        return n+1;
    }
}