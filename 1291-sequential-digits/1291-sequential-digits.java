import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digit = "123456789";
        List<Integer> res = new ArrayList<>();
        int nlow = String.valueOf(low).length();
        int nhigh = String.valueOf(high).length();

        for (int i = nlow; i <= nhigh; i++) {
            for (int j = 0; j < 10 - i; j++) {
                int value = Integer.parseInt(digit.substring(j, j + i));
                if (value >= low && value <= high) {
                    res.add(value);
                }
            }
        }

        return res;
    }
}
