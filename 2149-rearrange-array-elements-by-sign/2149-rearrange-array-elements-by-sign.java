class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length , j = 0 , k= 0 ;
        int[] ar1 = new int[n/2];
        int[] ar2 = new int[n/2];
        for(int i = 0 ;i<n;i++){
            if(nums[i]>0){
                ar1[k]=nums[i];
                k++;
            }
            else{
                ar2[j]=nums[i];
                j++;
            }
        }j=0;k=0;
        for(int i = 0 ;i<n;i++){
            nums[i]=ar1[k];
            k++;
            i++;
            nums[i] =ar2[j];
            j++;
        }return nums;
    }   
}