class Solution {
    public int countDigits(int num) {
        int counter=0;
        int n=num;
        while(n>0){
            int rem=n%10;
            n=n/10;
            if(num%rem==0){
                counter++;
            }
        }
        return counter;
    }
}