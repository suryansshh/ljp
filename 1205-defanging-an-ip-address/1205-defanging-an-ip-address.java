class Solution {
    public String defangIPaddr(String address) {
        String result = address.replaceAll("\\.","[.]");
        return result;
    }
}