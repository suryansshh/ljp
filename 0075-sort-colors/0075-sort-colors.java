class Solution {
    public void sortColors(int[] nums) {
        // to sovle the array using selection sort
       // int didswap = 0 ;
        int n = nums.length;
        for(int i = 0 ; i <n-1;i++){
            int min = i ;
            for(int j = i+1 ; j<n ;j++){
                if(nums[j]<nums[min]) min = j ;
                 
              
        }
           swap(nums , i , min);
          
    }
   
}
     public  void swap(int[] arr , int j , int min){
        int temp = arr[j];
        arr[j] = arr[min];
        arr[min] = temp;
    }
}