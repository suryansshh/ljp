class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        return helper(seats , students);
    }
    public int helper(int[] seats , int[] arr){
        int count = 0;
        Arrays.sort(seats);
        Arrays.sort(arr);
        for(int i = 0 ;i<arr.length;i++){
            count +=Math.abs(arr[i] - seats[i]);
        }
        return count;
    }
}