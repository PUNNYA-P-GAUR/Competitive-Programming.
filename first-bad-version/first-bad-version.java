/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int st=1;
        int end=n;
        while(st<end){
            int m=st+(end-st)/2;
            boolean res=isBadVersion(m);
            if(res==false){
                st=m+1;
            }
            else{
                end=m;
            }
        }
        return st;
    }
}