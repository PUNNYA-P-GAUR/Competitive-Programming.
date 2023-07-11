class Solution {
    public int findComplement(int num) {
        int temp=num;
        int c=1;
        while(temp!=0){
            num=num^c;
            c=c<<1;
            temp=temp>>1;
        }
        return num;
        
    }
}