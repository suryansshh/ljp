class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();

        for (String word : words) {
            for (String w : words) {
                
                if (!w.equals(word) && w.contains(word)) {
                    list.add(word);
                    break;
                }
            }
        }
        return list;
    }
}
