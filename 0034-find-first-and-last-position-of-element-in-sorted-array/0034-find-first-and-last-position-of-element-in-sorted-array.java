 class Solution {
    public int[] searchRange(int[] nums, int target) {
     int[] ans=new int [2];
     ans[0]=findFirst(nums,target);
    ans[1]=findLast(nums,target);
    return ans;
    }
  public int findFirst(int[] arr, int target){
          int index=-1;
          int start=0,end=arr.length-1;
          while(start<=end){
           int mid=start+(end-start)/2;
           if(arr[mid]==target){
              index=mid;
              end=mid-1; 
           }
           else if(arr[mid]>target){
              end=mid-1;
           }
           else{
               start=mid+1;
           }
          }
          return index;
  }
           public int findLast(int[]arr,int target){
               int index=-1;
               int start=0,end=arr.length-1;
               while(start<=end){
                   int mid=start+(end-start)/2;
                   if(arr[mid]==target){
                       index=mid;
                       start=mid+1;
                   }
                   else if(arr[mid]>target){
                     end=mid-1;
                   }
                   else{
                       start=mid+1;
                   }
               }
return index;
      }
      }


