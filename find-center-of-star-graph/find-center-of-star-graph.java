class Solution {
    public int findCenter(int[][] edges) {
        int ans=0;
        int c1=edges[0][0];
        int c2=edges[0][1];
        int c3=edges[1][0];
        int c4=edges[1][1];
        if(c1==c4){ans=c4;}
        if(c1==c3){ans=c1;}
        if(c2==c3){ans=c2;}
        if(c2==c4){ans=c4;}
        return ans;
    }
}