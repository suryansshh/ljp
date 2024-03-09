class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int x=0;
        int y=0;
        int count = -1;
        int len1=nums1.length;
        int len2 =nums2.length;
        while(x<len1 && y<len2){
            if(nums1[x]==nums2[y]){
                count=nums1[x];
                return count;
            }else if(nums1[x]<nums2[y]){
                x++;
            }else{
                y++;
            }
        }
        return count;
    }
}