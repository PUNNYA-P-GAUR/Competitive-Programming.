class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int last=height.length-1;
        int n=height.length-1;
        int area=0,area1=0;
        while(start<last){
            if(height[start]>height[last]){
                area=(height[last]*n);
                last--;
                n--;
            } 
            else{
                area=(height[start]*n);
                start++;
                n--;
            }
            if(area>area1){
                area1=area;
            }     
       }return area1;
    }
}