class Solution {
    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evens = (n + 1) / 2; 
        long odds = n / 2;       

        long part1 = powmod(5, evens);
        long part2 = powmod(4, odds);

        return (int)((part1 * part2) % MOD);
    }

    private long powmod(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % MOD;

            base = (base * base) % MOD;
            exp >>= 1;
        }

        return result;
    }
}