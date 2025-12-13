class Solution {

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        Set<String> curr = new HashSet<>();
        Collections.addAll(curr, "electronics", "grocery", "pharmacy", "restaurant");

        List<String> temp = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {

            if (!isActive[i] || code[i] == null || businessLine[i] == null) {
                continue;
            }

            if (isAlphanumeric(code[i]) && curr.contains(businessLine[i])) {
                temp.add(code[i]);
            }
        }

        Collections.sort(temp);
        return temp;
    }

    boolean isAlphanumeric(String code) {
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }
        return true;
    }
}
