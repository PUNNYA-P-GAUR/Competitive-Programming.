class Solution {
public:
    long long largestPerimeter(vector<int>& arr) {
      long sum=0;
        sort(arr.begin(),arr.end());
        for(auto i:arr){
            sum=sum+i;
        }
        for(int i=arr.size()-1;i>=2;i--){
            sum=sum-arr[i];
            if(sum>arr[i]){
                return sum+arr[i];
            }
        }
        return -1;
    }
};