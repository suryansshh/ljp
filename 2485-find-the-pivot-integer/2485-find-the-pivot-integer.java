class Solution {
    public int pivotInteger(int n) {
    int start = 1 ,end = n;
    return binary(start , end , n);    
    }
    public int binary(int start , int end,int n){
        while(start<=end){
            int mid = start+(end - start)/2;
            int sleft = sum(1 , mid-1);
            int sright = sum(mid+1 , n);
            if(sleft == sright) return mid;
            else if(sleft < sright) start = mid+1;
            else end =mid-1;
        }
        return -1;
    }
    public int sum(int start , int end){
        int sum = 0;
        for(int i = start ;i<=end;i++){
            sum +=i;
        }
        return sum;
    }

}