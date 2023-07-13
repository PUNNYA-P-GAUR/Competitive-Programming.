class Solution {
  public int divide(int divi, int div) {
		if(divi==1<<31 && div==-1){return Integer.MAX_VALUE;}
		boolean sign=(divi>=0)==(div>=0)?true:false;
		divi=Math.abs(divi);
		div=Math.abs(div);
		int res=0;
		while(divi-div>=0){
			int count=0;
			while(divi-(div<<1<<count)>=0){
				count++;
			}
			res+=1<<count;
			divi-=div<<count;
		}
		return sign?res:-res;

        
  }
}