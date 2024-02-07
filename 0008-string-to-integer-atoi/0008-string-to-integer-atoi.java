class Solution {
    public int myAtoi(String s) {
        char firstChar = s.charAt(0);
        if((firstChar >= 'a' && firstChar <= 'z') || (firstChar >= 'A' && firstChar <= 'Z'))
            return 0;
        
        StringBuilder sb = new StringBuilder();
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch(ch) {
                case '-':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    sb.append(ch);
                    break;
            }
        }
        String str = sb.toString();
        res = Integer.parseInt(str);
        return res;
    }
}
