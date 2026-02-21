public class atoi{
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') i++;

        if (i == n) return 0;

        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        long result = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (result * sign);
    }
} 
