import java.util.Arrays;

class Solution {
    public int totalMoney(int n) {
        int res = 0, day = 1;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        for (int i = 0; i < n; i++) {
            res += arr[day - 1]; // Add the current day's value
            day++; // Increment the day
            
            // Reset to the beginning of the week (1 to 7)
            if (day > 7) {
                day = 1;
                arr = Arrays.copyOf(arr, 7); // Reset the array to its initial state
                for (int j = 0; j < 7; j++) {
                    arr[j]++; // Increment each element of the array by 1
                }
            }
        }
        return res;
    }
}
