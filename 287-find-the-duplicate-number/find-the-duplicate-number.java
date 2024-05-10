class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        boolean vis[]=new boolean [n+1];
        for(int x:nums ){
          if(vis[x]==true){
            return x;
          }
          else vis[x]=true;
        }
        return -1;
        
    }
}