class Solution {
    public int specialArray(int[] nums) {
        
        int mid, count = 0, start = 0, end = nums.length;

        while(start <= end) {

            mid = (start + end) / 2;

            for(int i=0; i<nums.length; i++) {
                if(mid <= nums[i]) 
                    count++;
            }
                        
            if(mid == count)
                return mid;
            else if(mid < count)
                start = mid + 1;
            else
                end = mid - 1;

            count = 0;
            
        }

        return -1;

    }
}