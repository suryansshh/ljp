class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int start = Integer.MAX_VALUE , end= Integer.MIN_VALUE , mid = 0 , ans = - 1;
        if (m * k > bloomDay.length) {
            return -1;
        }
        for(int i:bloomDay){
            start = Math.min(start , i);
        }
        for(int i:bloomDay){
            end = Math.max(end , i);
        }
        while(start<=end){
            mid = start+(end - start)/2;
            boolean bloom = d(bloomDay , m , k , mid);
            if(bloom){
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }return ans;
    }
  public boolean d(int[] arr, int m, int k, int mid) {
    int day = 0, c = 0, res = 0;
    for (int i : arr) {
        if (i <= mid) {
            c++;
        } else {
            c = 0;
        }

        if (c == k) {
            res++;
            c = 0;  // Reset the count after forming a bouquet
        }
    }

    return res >= m;
}
}