class Solution {
    private long mod = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2; // Corrected the addition
        long odd = n / 2;
        long first = pow(5 , even) % mod;
        long second = pow(4 , odd) % mod;
        return (int) ((first * second) % mod);
    }
    
    public long pow(long x , long n) {
        if (n == 0) return 1;
        long temp = pow(x , n / 2) % mod; // Apply modulo here
        if (n % 2 == 0) {
            return (temp * temp) % mod;
        } else {
            return (x * temp * temp) % mod; // Apply modulo here
        }
    }
}
