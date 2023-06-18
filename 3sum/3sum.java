class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int size=nums.length; 
       
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<size-2;i++){
            int a1=i+1;
            int a2=size-1;
            //int sum=0;
            while(a1<a2){
                int sum=nums[i]+nums[a1]+nums[a2];
            
            if(sum==0){
                 ArrayList<Integer>ans=new ArrayList<>();
                ans.add(nums[i]);
                ans.add(nums[a1]);
                ans.add(nums[a2]);
                set.add(ans);
                a1++;
            }
            else if(sum<0){
                a1++;
            }
            else{
                a2--;
            }
        
        }
        }
        return new ArrayList<>(set); 

        
    }
}