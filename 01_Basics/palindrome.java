class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (except 0) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int original = x;  // Store original number
        int rev = 0;
        
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            
            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return false;
            }
            
            rev = rev * 10 + digit;
        }
        
        return rev == original;  // Compare reversed with original
    }
}