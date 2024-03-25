class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        return sort(nums);
    }
      public  List<Integer> sort(int[] nums){
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
       System.out.println(Arrays.toString(nums));
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }
        }
         return ans;
     
    }

     public   void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
    
}