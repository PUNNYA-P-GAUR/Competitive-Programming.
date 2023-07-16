class Solution {
    public double myPow(double x, int n) {
          if(n==0||x==1){
            return 1;
        }
        double v=myPow(x,n/2);
        v=v*v;
        if(n%2==0){
            return v;
        }
        else{
            if(n<0){
                return v*(1/x);
            }
            return v*x;
        }

        
    }
}