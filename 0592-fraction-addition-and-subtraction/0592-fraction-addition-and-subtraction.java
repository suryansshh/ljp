class Solution {
    public String fractionAddition(String expression) {
        String[] exp = expression.split("(?=[+-])");
        long num = 0, dem = 1;
        
        for (String fr : exp) {
            String[] curr = fr.split("/");
            long a = Long.parseLong(curr[0]);
            long b = Long.parseLong(curr[1]);
            num = num * b + a * dem;
            dem = dem * b;
        }
        
        if (num == 0) return "0/1";
        
        long gcd = gcd(Math.abs(num), Math.abs(dem));
        num /= gcd;
        dem /= gcd;
        
        return num + "/" + dem;
    }
    
    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
