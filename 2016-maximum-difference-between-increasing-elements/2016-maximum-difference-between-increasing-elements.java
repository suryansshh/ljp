class Solution {
    public int maximumDifference(int[] nums) {
    if(helper(nums)>0) return helper(nums);
    else return -1;
    }
    public int helper(int[] arr){
        int res= arr[1]-arr[0];
		int min =arr[0];
		for(int j = 1;j<arr.length;j++){
		    res = Math.max(res , arr[j]-min);
		    min=Math.min(min , arr[j]);
		}
        return res;
    }
}