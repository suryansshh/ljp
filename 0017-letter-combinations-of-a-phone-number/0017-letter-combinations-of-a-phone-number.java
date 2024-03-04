class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) // Check for empty input
            return res;
        
        HashMap<Character , String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        StringBuilder current = new StringBuilder();
        generateCombinations(digits, map, res, current, 0);
        return res;
    }
    
    private void generateCombinations(String digits, HashMap<Character , String> map, List<String> res, StringBuilder current, int index) {
        if (index == digits.length()) {
            res.add(current.toString());
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            generateCombinations(digits, map, res, current, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
