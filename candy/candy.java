class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        
        if(n == 1) return 1;
        
        int[] candies = new int[n];
        
        Arrays.fill(candies,1);

        int sum = 0;
         for(int i = n - 2 ; i >= 1 ; i--){
               if(ratings[i] <= ratings[i+1]  && ratings[i] <= ratings[i-1]){
                   continue;
               }
               if(ratings[i] >= ratings[i+1] && ratings[i] <= ratings[i-1]){
                   candies[i] = candies[i+1]+1;
               }
               else if(ratings[i] >= ratings[i-1] && ratings[i+1] >= ratings[i]){
                   candies[i] = candies[i-1]+1;
               }
               else{
                   candies[i] = Math.max(candies[i-1],candies[i+1])+1;
               }
         }
        
         for(int i = 1 ; i < n - 1 ; i++){
             if(ratings[i] > ratings[i-1] && candies[i] <= candies[i-1]){
                 candies[i] = candies[i-1]+1;
             }
         }
        
         if(ratings[n-1] > ratings[n-2] && candies[n-1] <= candies[n-2]){
             candies[n-1] = candies[n-2]+1;
         }
         
         if(ratings[0] > ratings[1] && candies[0] <= candies[1]){
             candies[0] = candies[1]+1;
         }
        
         for(int i : candies){
            sum += i;
         }
        
       return sum;
    }
}