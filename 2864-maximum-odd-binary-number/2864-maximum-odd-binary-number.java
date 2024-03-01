import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String maximumOddBinaryNumber(String s) {
        // Convert the binary string to an array of integers
        Integer[] arr = new Integer[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = Character.getNumericValue(s.charAt(i));
        }

        // Sort the array in descending order
        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        });

        // Convert the sorted array back to a string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        // Swap the last '1' with the last character in the string
        int last = sb.length() - 1;
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '1') {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(last));
                sb.setCharAt(last, temp);
                break; // Swap only once
            }
        }

        // Return the modified string
        return sb.toString();
    }
}
