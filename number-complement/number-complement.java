class Solution {
    public int findComplement(int n) {
        int c=1;
        int temp=n;
        while(temp!=0){
            n=n^c;
            c=c<<1;
            temp=temp>>1;
        }
        return n;
        
    }
}