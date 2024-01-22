class Solution {
    public int[] findErrorNums(int[] nums) {
        return sort(nums);
    }
     public  int[] sort(int[] nums){
        int len = nums.length;
        // int dublicate = 0;
        int i = 0;
        while (i < len) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }

        }
      
       int[] ans = new int[2];
       for (int j = 0; j < nums.length; j++) {
        if(nums[j]!=j+1){
            ans[0]=nums[j];
            ans[1]=j+1;
        }
       } return ans;
     
    }

     public   void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}